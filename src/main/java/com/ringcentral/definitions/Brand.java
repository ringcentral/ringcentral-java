package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Brand
{
    //
    public String id;
    public Brand id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public Brand name(String name) {
        this.name = name;
        return this;
    }
    //
    public HomeCountry homeCountry;
    public Brand homeCountry(HomeCountry homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
}
