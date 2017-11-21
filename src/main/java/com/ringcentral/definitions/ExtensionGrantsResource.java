package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionGrantsResource
{
    //
    public String uri;
    public ExtensionGrantsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ExtensionGrantResource[] records;
    public ExtensionGrantsResource records(ExtensionGrantResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public ExtensionGrantsResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public ExtensionGrantsResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
