package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ScaledProfileImageResource
{
    //
    public String uri;
    public ScaledProfileImageResource uri(String uri) {
        this.uri = uri;
        return this;
    }
}
