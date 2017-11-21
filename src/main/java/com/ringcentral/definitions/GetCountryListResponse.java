package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetCountryListResponse
{
    // List of countries with the country data
    public GetCountryInfoDictionaryResponse[] records;
    public GetCountryListResponse records(GetCountryInfoDictionaryResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetCountryListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetCountryListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
