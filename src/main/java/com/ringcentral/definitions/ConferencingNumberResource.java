package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ConferencingNumberResource
{
    //
    public String uri;
    public ConferencingNumberResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String phoneNumber;
    public ConferencingNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public CountryResource country;
    public ConferencingNumberResource country(CountryResource country) {
        this.country = country;
        return this;
    }
    //
    public String location;
    public ConferencingNumberResource location(String location) {
        this.location = location;
        return this;
    }
    //
    public Boolean hasGreeting;
    public ConferencingNumberResource hasGreeting(Boolean hasGreeting) {
        this.hasGreeting = hasGreeting;
        return this;
    }
    //
    @JSONField(alternateNames = {"default"})
    public Boolean _default;
    public ConferencingNumberResource _default(Boolean _default) {
        this._default = _default;
        return this;
    }
}
