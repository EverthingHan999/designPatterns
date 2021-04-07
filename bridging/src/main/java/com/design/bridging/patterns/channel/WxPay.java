package com.design.bridging.patterns.channel;

import com.design.bridging.patterns.mode.IPayModel;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class WxPay extends Pay{
    public WxPay(IPayModel payModel) {
        super(payModel);
    }

    @Override
    public String transfer(String uid, String tradeid, BigDecimal amount) {
        log.info("模拟微信支付渠道划账开始，uid: {},tradeid: {},amount: {}", uid, tradeid, amount);
        boolean security = payModel.security(uid);
        log.info("模拟微信渠道风控校验，uid: {},tradeid: {},security: {}", uid, tradeid, security);
        if (!security) {
            log.info("模拟微信渠道划账拦截，uid: {},tradeid: {},amout: {}", uid, tradeid, amount);
            return "0001";
        }
        log.info("模拟微信渠道支付划账成功，uid: {},tradeid: [],amount: {}", uid, tradeid, amount);
        return "0000";
    }
}
