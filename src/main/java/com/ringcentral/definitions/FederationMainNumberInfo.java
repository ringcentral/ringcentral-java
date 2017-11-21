package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationMainNumberInfo
{
    // Main company number of an account in E.164 format
    public String phoneNumber;
    public FederationMainNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Main company number of an account formatted as consistent with the home country of the current extension
    public String formattedPhoneNumber;
    public FederationMainNumberInfo formattedPhoneNumber(String formattedPhoneNumber) {
        this.formattedPhoneNumber = formattedPhoneNumber;
        return this;
    }
}
