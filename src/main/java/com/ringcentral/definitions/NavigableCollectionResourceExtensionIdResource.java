package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NavigableCollectionResourceExtensionIdResource
{
    //
    public String uri;
    public NavigableCollectionResourceExtensionIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ExtensionIdResource[] records;
    public NavigableCollectionResourceExtensionIdResource records(ExtensionIdResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public NavigableCollectionResourceExtensionIdResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public NavigableCollectionResourceExtensionIdResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
