package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TimezonesResource
{
    //
    public String uri;
    public TimezonesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public TimezoneResource[] records;
    public TimezonesResource records(TimezoneResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public TimezonesResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public TimezonesResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
