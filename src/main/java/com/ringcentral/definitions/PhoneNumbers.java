package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumbers
{
    // Canonical URI of the phone numbers resource
    public String uri;
    public PhoneNumbers uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of phone numbers filtered by the specified criteria
    public LookupPhoneNumberInfo[] records;
    public PhoneNumbers records(LookupPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }
}
