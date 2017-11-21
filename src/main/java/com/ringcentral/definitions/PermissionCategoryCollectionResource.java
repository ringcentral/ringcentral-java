package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PermissionCategoryCollectionResource
{
    //
    public String uri;
    public PermissionCategoryCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PermissionCategoryResource[] records;
    public PermissionCategoryCollectionResource records(PermissionCategoryResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public PermissionCategoryCollectionResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public PermissionCategoryCollectionResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
