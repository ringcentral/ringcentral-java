package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SipDetailsToRegister
{
    //
    public String transport;
    public SipDetailsToRegister transport(String transport) {
        this.transport = transport;
        return this;
    }
}
