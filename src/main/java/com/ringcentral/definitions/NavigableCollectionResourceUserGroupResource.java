package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class NavigableCollectionResourceUserGroupResource
{
    //
    public String uri;
    public NavigableCollectionResourceUserGroupResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public UserGroupResource[] records;
    public NavigableCollectionResourceUserGroupResource records(UserGroupResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public NavigableCollectionResourceUserGroupResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public NavigableCollectionResourceUserGroupResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
