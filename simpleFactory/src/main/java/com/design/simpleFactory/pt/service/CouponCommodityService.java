package com.design.simpleFactory.pt.service;

import com.design.simpleFactory.pt.ICommodity;
import com.design.simpleFactory.sp.CouponResult;
import com.design.simpleFactory.sp.CouponService;
import com.design.utils.JSONUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class CouponCommodityService implements ICommodity {

    private CouponService couponService=new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        try {
            log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONUtils.getObjectMapper().writeValueAsString(extMap));
            log.info("测试结果[优惠券]：{}", JSONUtils.getObjectMapper().writeValueAsString(couponResult));
            if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
