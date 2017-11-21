package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Cookie
{
    //
    public String name;
    public Cookie name(String name) {
        this.name = name;
        return this;
    }
    //
    public String value;
    public Cookie value(String value) {
        this.value = value;
        return this;
    }
    //
    public Long version;
    public Cookie version(Long version) {
        this.version = version;
        return this;
    }
    //
    public String path;
    public Cookie path(String path) {
        this.path = path;
        return this;
    }
    //
    public String domain;
    public Cookie domain(String domain) {
        this.domain = domain;
        return this;
    }
}
