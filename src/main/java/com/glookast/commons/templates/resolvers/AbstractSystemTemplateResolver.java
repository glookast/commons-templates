package com.glookast.commons.templates.resolvers;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This class resolves the type to be used when marshalling/unmarshalling Metadata|Storage Systems
 * In case no type is found but the base fields are present it defaults to Unsupported{Metadata|Storage}System
 * This ensures that newly added Systems can still be parsed (thus not breaking the API) but won't be fully
 * supported yet e.g.: the UI will list them as read-only
 */
public abstract class AbstractSystemTemplateResolver extends TypeIdResolverBase {

    private JavaType superType;

    @Override
    public void init(JavaType baseType) {
        superType = baseType;
    }

    @Override
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.NAME;
    }

    @Override
    public String idFromValue(Object obj) {
        return idFromValueAndType(obj, obj.getClass());
    }

    @SneakyThrows
    @Override
    public String idFromValueAndType(Object obj, Class<?> subType) {

        Optional<JsonSubTypes.Type> foundTypeId = getAllRegisteredSubTypes()
            .stream()
            .filter(t -> t.value().equals(subType))
            .findFirst();

        return foundTypeId.map(JsonSubTypes.Type::name).orElse(this.getUnsupportedSystemTypeClass().getSimpleName());

    }

    @SneakyThrows
    @Override
    public JavaType typeFromId(DatabindContext context, String id) {

        Class<?> subType = this.getUnsupportedSystemTypeClass();

        List<JsonSubTypes.Type> subTypes = getAllRegisteredSubTypes();
        Optional<JsonSubTypes.Type> foundSubType = subTypes
            .stream()
            .filter(t -> t.name().equals(id))
            .findFirst();

        if (foundSubType.isPresent()) {
            subType = Class.forName(foundSubType.get().value().getCanonicalName());
        }

        return context.constructSpecializedType(superType, subType);
    }

    public Class<?> getSystemTypeClass() throws Exception {
        throw new Exception("This method must be overridden by concrete class");
    }

    public Class<?> getUnsupportedSystemTypeClass() throws Exception {
        throw new Exception("This method must be overridden by concrete class");
    }

    private List<JsonSubTypes.Type> getAllRegisteredSubTypes() throws Exception {

        Class<?> templateTypeClass = this.getSystemTypeClass();
        Annotation[] annotations = templateTypeClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof JsonSubTypes) {
                JsonSubTypes.Type[] types = ((JsonSubTypes) annotation).value();
                return Arrays.stream(types).collect(Collectors.toList());
            }
        }

        return new ArrayList<>();

    }

}