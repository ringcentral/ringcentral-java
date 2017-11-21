package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BrandInfo
{
    // Internal identifier of a brand
    public String id;
    public BrandInfo id(String id) {
        this.id = id;
        return this;
    }
    // Brand name, for example  RingCentral UK ,  ClearFax
    public String name;
    public BrandInfo name(String name) {
        this.name = name;
        return this;
    }
    // Home country information
    public CountryInfo homeCountry;
    public BrandInfo homeCountry(CountryInfo homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
}
