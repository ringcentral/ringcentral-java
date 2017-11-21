package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class StateResource
{
    //
    public String uri;
    public StateResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public StateResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public StateResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String isoCode;
    public StateResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    //
    public VersionedResource country;
    public StateResource country(VersionedResource country) {
        this.country = country;
        return this;
    }
}
