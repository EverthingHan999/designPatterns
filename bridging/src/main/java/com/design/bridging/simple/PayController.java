package com.design.bridging.simple;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class PayController {

    public boolean doPay(String uid, String tradeid, BigDecimal amount, int channelType, int modeType) {
        if (1 == channelType) {
            log.info("模拟微信渠道支付划账开始 uid={},tradeid={},amount={}",uid,tradeid,amount);
            if (1 == modeType) {
                log.info("密码支付");
            } else if (2 == modeType) {
                log.info("人脸支付");
            } else if (3 == modeType) {
                log.info("指纹支付");
            }
        }else if (2 == channelType) {
            log.info("模拟支付宝渠道支付划账开始 uid={},tradeid={},amount={}",uid,tradeid,amount);
            if (1 == modeType) {
                log.info("密码支付");
            } else if (2 == modeType) {
                log.info("人脸支付");
            } else if (3 == modeType) {
                log.info("指纹支付");
            }
        }
        return true;
    }
}
