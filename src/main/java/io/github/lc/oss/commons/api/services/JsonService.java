package io.github.lc.oss.commons.api.services;

import io.github.lc.oss.commons.serialization.Jsonable;

public interface JsonService {
    <T extends Jsonable> T from(String json, Class<T> clazz);

    String to(Jsonable object);
}
