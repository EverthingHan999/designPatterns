package com.design.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {
    private static ObjectMapper objectMapper;
    static{
        objectMapper = new ObjectMapper();
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
