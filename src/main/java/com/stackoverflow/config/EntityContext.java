package com.stackoverflow.config;

import java.util.HashMap;
import java.util.Map;

public class EntityContext {

    private static Map<Class<?>,Object> entityInstanceMap;

    protected static void initialize()
    {
        entityInstanceMap = new HashMap< Class< ? >, Object>();
    }

    protected <T>void registerEntity(Class<T>entityType,Object entity)
    {
        entityInstanceMap.put(entityType,entity);
    }

    protected <T> T getEntity(Class<T>entityType)
    {
        return entityType.cast(entityInstanceMap.get(entityType));
    }


}
