package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionUserGroupsResource
{
    //
    public String uri;
    public ExtensionUserGroupsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public UserGroupIdResource[] groups;
    public ExtensionUserGroupsResource groups(UserGroupIdResource[] groups) {
        this.groups = groups;
        return this;
    }
}
