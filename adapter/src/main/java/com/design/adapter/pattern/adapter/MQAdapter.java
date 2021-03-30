package com.design.adapter.pattern.adapter;

import com.design.adapter.RebateInfo;
import com.design.utils.JSONUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws JsonProcessingException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSONUtils.getObjectMapper().readValue(strJson, Map.class),link);
    }

    private static RebateInfo filter(Map readValue, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = readValue.get(link.get(key));
            rebateInfo.getClass().getMethod("set" + key.replace(key.charAt(0),Character.toUpperCase(key.charAt(0))), val.getClass())
                    .invoke(rebateInfo, val);
        }
        return rebateInfo;
    }
}
