package com.design.adapter.simple.service;

import org.apache.log4j.Logger;

public class POPOrderService {
    private Logger logger = Logger.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String userid) {
        logger.info("POP商家，查询用户订单是否为首单：" + userid);
        return true;
    }
}
