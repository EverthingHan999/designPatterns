package com.design.simpleFactory.pt.service;

import com.design.simpleFactory.pt.ICommodity;
import com.design.simpleFactory.sp.DeliverReq;
import com.design.simpleFactory.sp.GoodsService;
import com.design.utils.JSONUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class GoodsCommodityService implements ICommodity {
    GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName("花花");
        deliverReq.setUserPhone("123456789");
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONUtils.writeValueToString(extMap));
        log.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
    }
}
