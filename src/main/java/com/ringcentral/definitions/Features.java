package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Features
{
    //
    public Feature voip;
    public Features voip(Feature voip) {
        this.voip = voip;
        return this;
    }
    //
    public Feature ringOut;
    public Features ringOut(Feature ringOut) {
        this.ringOut = ringOut;
        return this;
    }
    //
    public Feature sms;
    public Features sms(Feature sms) {
        this.sms = sms;
        return this;
    }
    //
    public Feature faxOut;
    public Features faxOut(Feature faxOut) {
        this.faxOut = faxOut;
        return this;
    }
}
