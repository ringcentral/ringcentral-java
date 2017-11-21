package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetDialingPlanInfo
{
    // List of countries which can be selected for a dialing plan
    public GetDialingPlanCountryInfo[] records;
    public GetDialingPlanInfo records(GetDialingPlanCountryInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetDialingPlanInfo paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetDialingPlanInfo navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
