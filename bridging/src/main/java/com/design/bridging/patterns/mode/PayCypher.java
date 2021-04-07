package com.design.bridging.patterns.mode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayCypher implements IPayModel{
    @Override
    public boolean security(String uId) {
        log.info("密码支付，风控校验安全");
        return false;
    }
}
