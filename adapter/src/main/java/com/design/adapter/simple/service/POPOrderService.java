package com.design.adapter.simple.service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class POPOrderService {
    //private Logger logger = Logger.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String userid) {
        log.info("POP商家，查询用户订单是否为首单：" + userid);
        return true;
    }
}
