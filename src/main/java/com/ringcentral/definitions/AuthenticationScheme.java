package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AuthenticationScheme
{
    //
    public String description;
    public AuthenticationScheme description(String description) {
        this.description = description;
        return this;
    }
    //
    public String documentationUrl;
    public AuthenticationScheme documentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }
    //
    public String name;
    public AuthenticationScheme name(String name) {
        this.name = name;
        return this;
    }
    //
    public String specUrl;
    public AuthenticationScheme specUrl(String specUrl) {
        this.specUrl = specUrl;
        return this;
    }
}
