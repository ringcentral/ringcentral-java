package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TimezoneResource
{
    //
    public String uri;
    public TimezoneResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public TimezoneResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public TimezoneResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String description;
    public TimezoneResource description(String description) {
        this.description = description;
        return this;
    }
}
