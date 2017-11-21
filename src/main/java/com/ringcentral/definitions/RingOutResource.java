package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RingOutResource
{
    //
    public RingOutFromInfo from;
    public RingOutResource from(RingOutFromInfo from) {
        this.from = from;
        return this;
    }
    //
    public RingOutPhoneNumberInfo to;
    public RingOutResource to(RingOutPhoneNumberInfo to) {
        this.to = to;
        return this;
    }
    //
    public RingOutPhoneNumberInfo callerId;
    public RingOutResource callerId(RingOutPhoneNumberInfo callerId) {
        this.callerId = callerId;
        return this;
    }
    //
    public Boolean playPrompt;
    public RingOutResource playPrompt(Boolean playPrompt) {
        this.playPrompt = playPrompt;
        return this;
    }
    //
    public RingOutCountry country;
    public RingOutResource country(RingOutCountry country) {
        this.country = country;
        return this;
    }
}
