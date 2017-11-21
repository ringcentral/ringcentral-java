package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LocationResource
{
    //
    public String uri;
    public LocationResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String city;
    public LocationResource city(String city) {
        this.city = city;
        return this;
    }
    //
    public String areaCode;
    public LocationResource areaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    //
    public String npa;
    public LocationResource npa(String npa) {
        this.npa = npa;
        return this;
    }
    //
    public String nxx;
    public LocationResource nxx(String nxx) {
        this.nxx = nxx;
        return this;
    }
    //
    public VersionedResource state;
    public LocationResource state(VersionedResource state) {
        this.state = state;
        return this;
    }
}
