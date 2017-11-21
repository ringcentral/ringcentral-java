package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NameInfo
{
    // User first name
    public String givenName;
    public NameInfo givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }
    // User last name
    public String familyName;
    public NameInfo familyName(String familyName) {
        this.familyName = familyName;
        return this;
    }
}
