package com.glookast.commons.templates.resolvers;

import com.glookast.commons.templates.StorageSystem;
import com.glookast.commons.templates.UnsupportedStorageSystem;

public class StorageSystemTemplateResolver extends AbstractSystemTemplateResolver {

    @Override
    public Class<?> getSystemTypeClass() {
        return StorageSystem.class;
    }

    @Override
    public Class<?> getUnsupportedSystemTypeClass() {
        return UnsupportedStorageSystem.class;
    }

}
