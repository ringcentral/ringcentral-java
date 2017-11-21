package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingNumbersResource
{
    //
    public String uri;
    public ForwardingNumbersResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ForwardingNumberResource[] records;
    public ForwardingNumbersResource records(ForwardingNumberResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public ForwardingNumbersResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public ForwardingNumbersResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
