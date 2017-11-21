package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumbersResource
{
    //
    public String uri;
    public PhoneNumbersResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PhoneNumberResource[] records;
    public PhoneNumbersResource records(PhoneNumberResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public PhoneNumbersResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public PhoneNumbersResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
