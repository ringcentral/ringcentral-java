package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SIPInfoRequest
{
    // Supported transport. SIP info will be returned for this transport if supported
    public String transport;
    public SIPInfoRequest transport(String transport) {
        this.transport = transport;
        return this;
    }
}
