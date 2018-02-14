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
    // Specifies if a phone number should be hidden or not. Returned only if the value is 'True'
    public Boolean hidden;
    public CompanyDirectoryPhoneNumberInfo hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    // Usage type of a phone number
    public String usageType;
    public CompanyDirectoryPhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
