package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserGroupManagerResource
{
    //
    public String uri;
    public UserGroupManagerResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public UserGroupManagerResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String extensionNumber;
    public UserGroupManagerResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String firstName;
    public UserGroupManagerResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    //
    public String lastName;
    public UserGroupManagerResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
