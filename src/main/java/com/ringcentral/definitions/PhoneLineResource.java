package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneLineResource
{
    //
    public String lineType;
    public PhoneLineResource lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    //
    public PhoneNumberResource phoneInfo;
    public PhoneLineResource phoneInfo(PhoneNumberResource phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
    //
    public EmergencyAddress emergencyAddress;
    public PhoneLineResource emergencyAddress(EmergencyAddress emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }
}
