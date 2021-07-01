package com.design.simpleFactory.sp;

import com.design.utils.JSONUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * 模拟实物商品服务
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        try {
            System.out.println("模拟发货实物商品一个：" + JSONUtils.getObjectMapper().writeValueAsString(req));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return true;
    }

}
