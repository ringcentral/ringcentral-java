package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetCountryInfoNumberParser
{
    // Internal identifier of a country
    public String id;
    public GetCountryInfoNumberParser id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a country
    public String uri;
    public GetCountryInfoNumberParser uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
    public String callingCode;
    public GetCountryInfoNumberParser callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
    // Emergency calling feature availability/emergency address requirement indicator
    public Boolean emergencyCalling;
    public GetCountryInfoNumberParser emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }
    // Country code according to the ISO standard, see ISO 3166
    public String isoCode;
    public GetCountryInfoNumberParser isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    // Official name of a country
    public String name;
    public GetCountryInfoNumberParser name(String name) {
        this.name = name;
        return this;
    }
}
