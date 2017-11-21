package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class HomeCountryResource
{
    //
    public String uri;
    public HomeCountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public HomeCountryResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public HomeCountryResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String isoCode;
    public HomeCountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    //
    public String callingCode;
    public HomeCountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
}
