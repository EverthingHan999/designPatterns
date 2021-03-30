package com.design.adapter.simple.service;

import org.apache.log4j.Logger;

public class OrderService {
    private Logger logger = Logger.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("自营商家，查询用户的订单是否为首单: "+userId);
        return 10l;
    }
}
