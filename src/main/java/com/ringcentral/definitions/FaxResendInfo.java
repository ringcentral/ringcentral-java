package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FaxResendInfo
{
    //
    public Long originalMessageId;
    public FaxResendInfo originalMessageId(Long originalMessageId) {
        this.originalMessageId = originalMessageId;
        return this;
    }
    //
    public String sendTime;
    public FaxResendInfo sendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    //
    public CallerInfo[] to;
    public FaxResendInfo to(CallerInfo[] to) {
        this.to = to;
        return this;
    }
}
