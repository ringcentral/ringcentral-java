package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NumberPortingRequest
{
    //
    public Long rcAccountId;
    public NumberPortingRequest rcAccountId(Long rcAccountId) {
        this.rcAccountId = rcAccountId;
        return this;
    }
    //
    public Long rcOrderId;
    public NumberPortingRequest rcOrderId(Long rcOrderId) {
        this.rcOrderId = rcOrderId;
        return this;
    }
    //
    public String orderStatus;
    public NumberPortingRequest orderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    //
    public String timestamp;
    public NumberPortingRequest timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    //
    public String jcode;
    public NumberPortingRequest jcode(String jcode) {
        this.jcode = jcode;
        return this;
    }
    //
    public String completionDate;
    public NumberPortingRequest completionDate(String completionDate) {
        this.completionDate = completionDate;
        return this;
    }
    //
    public String transferDate;
    public NumberPortingRequest transferDate(String transferDate) {
        this.transferDate = transferDate;
        return this;
    }
}
