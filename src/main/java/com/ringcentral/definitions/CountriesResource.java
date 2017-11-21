package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CountriesResource
{
    //
    public String uri;
    public CountriesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public CountryResource[] records;
    public CountriesResource records(CountryResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public CountriesResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public CountriesResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
