package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class StatesResource
{
    //
    public String uri;
    public StatesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public StateResource[] records;
    public StatesResource records(StateResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public StatesResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public StatesResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
