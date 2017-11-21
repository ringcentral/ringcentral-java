package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LocationsResource
{
    //
    public String uri;
    public LocationsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public LocationResource[] records;
    public LocationsResource records(LocationResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public LocationsResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public LocationsResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
