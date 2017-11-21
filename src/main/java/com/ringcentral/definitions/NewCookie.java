package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NewCookie
{
    //
    public String name;
    public NewCookie name(String name) {
        this.name = name;
        return this;
    }
    //
    public String value;
    public NewCookie value(String value) {
        this.value = value;
        return this;
    }
    //
    public Long version;
    public NewCookie version(Long version) {
        this.version = version;
        return this;
    }
    //
    public String path;
    public NewCookie path(String path) {
        this.path = path;
        return this;
    }
    //
    public String domain;
    public NewCookie domain(String domain) {
        this.domain = domain;
        return this;
    }
    //
    public String comment;
    public NewCookie comment(String comment) {
        this.comment = comment;
        return this;
    }
    //
    public Long maxAge;
    public NewCookie maxAge(Long maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    //
    public String expiry;
    public NewCookie expiry(String expiry) {
        this.expiry = expiry;
        return this;
    }
    //
    public Boolean secure;
    public NewCookie secure(Boolean secure) {
        this.secure = secure;
        return this;
    }
    //
    public Boolean httpOnly;
    public NewCookie httpOnly(Boolean httpOnly) {
        this.httpOnly = httpOnly;
        return this;
    }
}
