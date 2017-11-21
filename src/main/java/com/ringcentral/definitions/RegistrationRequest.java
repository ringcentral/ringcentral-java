package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RegistrationRequest
{
    //
    public DeviceToRegister device;
    public RegistrationRequest device(DeviceToRegister device) {
        this.device = device;
        return this;
    }
    //
    public SipDetailsToRegister[] sipInfo;
    public RegistrationRequest sipInfo(SipDetailsToRegister[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }
}
