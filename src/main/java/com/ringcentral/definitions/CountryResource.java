package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CountryResource
{
    //
    public String uri;
    public CountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public CountryResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public CountryResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String isoCode;
    public CountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    //
    public String callingCode;
    public CountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
    //
    public Boolean emergencyCalling;
    public CountryResource emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }
    //
    public Boolean numberSelling;
    public CountryResource numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }
    //
    public Boolean loginAllowed;
    public CountryResource loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }
}
