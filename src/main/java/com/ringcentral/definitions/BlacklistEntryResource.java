package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BlacklistEntryResource
{
    //
    public String uri;
    public BlacklistEntryResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public BlacklistEntryResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String phoneNumber;
    public BlacklistEntryResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String name;
    public BlacklistEntryResource name(String name) {
        this.name = name;
        return this;
    }
}
