package com.glookast.commons.templates.resolvers;

import com.glookast.commons.templates.MetadataSystem;
import com.glookast.commons.templates.UnsupportedMetadataSystem;

public class MetadataSystemTemplateResolver extends AbstractSystemTemplateResolver {

    @Override
    public Class<?> getSystemTypeClass() {
        return MetadataSystem.class;
    }

    @Override
    public Class<?> getUnsupportedSystemTypeClass() {
        return UnsupportedMetadataSystem.class;
    }
}
