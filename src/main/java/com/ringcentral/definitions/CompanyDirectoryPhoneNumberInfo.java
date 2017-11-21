package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyDirectoryPhoneNumberInfo
{
    // Extension phone number in E.164 format
    public String phoneNumber;
    public CompanyDirectoryPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Type of a phone number
    public String type;
    public CompanyDirectoryPhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }
}
