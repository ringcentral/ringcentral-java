package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BlockedNumberInfo
{
    // Internal identifier of a blocked number
    public String id;
    public BlockedNumberInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a blocked number
    public String uri;
    public BlockedNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Name assigned by a user to a blocked phone number
    public String name;
    public BlockedNumberInfo name(String name) {
        this.name = name;
        return this;
    }
    // Phone number to be blocked
    public String phoneNumber;
    public BlockedNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
