package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumberStringsResource
{
    //
    public String uri;
    public PhoneNumberStringsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String[] originalStrings;
    public PhoneNumberStringsResource originalStrings(String[] originalStrings) {
        this.originalStrings = originalStrings;
        return this;
    }
}
