package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RolesCollectionResource
{
    //
    public String uri;
    public RolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public RoleResource[] records;
    public RolesCollectionResource records(RoleResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public RolesCollectionResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public RolesCollectionResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
