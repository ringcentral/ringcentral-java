package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NameInfoRequest
{
    // User first name
    public String givenName;
    public NameInfoRequest givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }
    // User last name
    public String familyName;
    public NameInfoRequest familyName(String familyName) {
        this.familyName = familyName;
        return this;
    }
}
