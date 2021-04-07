package com.design.bridging.patterns.channel;

import com.design.bridging.patterns.mode.IPayModel;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public abstract class Pay {
    protected IPayModel payModel;

    public Pay(IPayModel payModel) {
        this.payModel = payModel;
    }

    public abstract String transfer(String uid, String tradeid, BigDecimal amount);
}
