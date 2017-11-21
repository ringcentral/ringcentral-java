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
    public PhoneNumberInfo phoneInfo;
    public PhoneLinesInfo phoneInfo(PhoneNumberInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
