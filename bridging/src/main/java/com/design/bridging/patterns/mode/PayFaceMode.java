package com.design.bridging.patterns.mode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayFaceMode implements IPayModel{
    @Override
    public boolean security(String uId) {
        log.info("面部识别支付，风控环境安全");
        return false;
    }
}
