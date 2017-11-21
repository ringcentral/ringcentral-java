package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserGroupIdResource
{
    //
    public String uri;
    public UserGroupIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public UserGroupIdResource id(String id) {
        this.id = id;
        return this;
    }
}
