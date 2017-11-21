package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumbersRecordsResource
{
    //
    public String uri;
    public PhoneNumbersRecordsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PhoneNumberResource[] records;
    public PhoneNumbersRecordsResource records(PhoneNumberResource[] records) {
        this.records = records;
        return this;
    }
}
