package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneLinesInfo
{
    // Type of phone line
    public String lineType;
    public PhoneLinesInfo lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    // Phone number information
    public PhoneNumberInfoIntId phoneInfo;
    public PhoneLinesInfo phoneInfo(PhoneNumberInfoIntId phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
