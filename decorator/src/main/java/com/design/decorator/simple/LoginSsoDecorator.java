package com.design.decorator.simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoDecorator extends SsoInterceptor {
    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("duoduo", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        boolean success = ticket.equals("success");
        if (!success){ return false;}
        String userId = request.substring(9);
        String method = authMap.get(userId);

        return "queryUserInfo".equals(method);

    }
}
