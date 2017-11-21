package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class HomeCountry
{
    //
    public String id;
    public HomeCountry id(String id) {
        this.id = id;
        return this;
    }
    //
    public String uri;
    public HomeCountry uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String name;
    public HomeCountry name(String name) {
        this.name = name;
        return this;
    }
    //
    public String isoCode;
    public HomeCountry isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    //
    public String callingCode;
    public HomeCountry callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
}
