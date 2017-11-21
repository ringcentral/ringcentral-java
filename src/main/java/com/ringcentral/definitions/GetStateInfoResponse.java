package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetStateInfoResponse
{
    // Internal identifier of a state
    public String id;
    public GetStateInfoResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a state
    public String uri;
    public GetStateInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Information on a country the state belongs to
    public GetCountryInfoState country;
    public GetStateInfoResponse country(GetCountryInfoState country) {
        this.country = country;
        return this;
    }
    // Short code for a state (2-letter usually)
    public String isoCode;
    public GetStateInfoResponse isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    // Official name of a state
    public String name;
    public GetStateInfoResponse name(String name) {
        this.name = name;
        return this;
    }
}
