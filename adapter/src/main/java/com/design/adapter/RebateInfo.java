package com.design.adapter;

import java.util.Date;

/**
 * @author hjz
 * @desc 统一的MQ消息适配
 * @date 2021/3/29 16:03
 */
public class RebateInfo {
    private String userId;//用户ID
    private String bizId;//业务ID
    private Date bizTime;//业务时间
    private String desc;//业务描述

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(Long bizTime) {
        this.bizTime = new Date(bizTime);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
