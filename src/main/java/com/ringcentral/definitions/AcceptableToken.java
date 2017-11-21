package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AcceptableToken
{
    //
    public String token;
    public AcceptableToken token(String token) {
        this.token = token;
        return this;
    }
    //
    public Long quality;
    public AcceptableToken quality(Long quality) {
        this.quality = quality;
        return this;
    }
}
