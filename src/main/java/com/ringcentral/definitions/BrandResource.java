package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BrandResource
{
    //
    public String uri;
    public BrandResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public BrandResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public BrandResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public CountryResource homeCountry;
    public BrandResource homeCountry(CountryResource homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
    //
    public Currency currency;
    public BrandResource currency(Currency currency) {
        this.currency = currency;
        return this;
    }
}
