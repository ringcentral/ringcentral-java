package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Extensions
{
    //
    public String uri;
    public Extensions uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ExtensionResource[] records;
    public Extensions records(ExtensionResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public Extensions paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public Extensions navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
