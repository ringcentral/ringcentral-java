package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RegistrationResponse
{
    //
    public String uri;
    public RegistrationResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public DeviceResource device;
    public RegistrationResponse device(DeviceResource device) {
        this.device = device;
        return this;
    }
    //
    public SipInfo[] sipInfo;
    public RegistrationResponse sipInfo(SipInfo[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }
    //
    public SipFlags sipFlags;
    public RegistrationResponse sipFlags(SipFlags sipFlags) {
        this.sipFlags = sipFlags;
        return this;
    }
}
