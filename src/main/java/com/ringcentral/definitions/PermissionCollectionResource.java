package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PermissionCollectionResource
{
    //
    public String uri;
    public PermissionCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PermissionResource[] records;
    public PermissionCollectionResource records(PermissionResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public PermissionCollectionResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public PermissionCollectionResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
