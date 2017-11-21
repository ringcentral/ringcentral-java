package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CountryInfo
{
    // Internal identifier of a home country
    public String id;
    public CountryInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a home country
    public String uri;
    public CountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Official name of a home country
    public String name;
    public CountryInfo name(String name) {
        this.name = name;
        return this;
    }
}
