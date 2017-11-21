package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipPersonInfo
{
    // Internal identifier of a user
    public String id;
    public GlipPersonInfo id(String id) {
        this.id = id;
        return this;
    }
    // First name of a user
    public String firstName;
    public GlipPersonInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    // Last name of a user
    public String lastName;
    public GlipPersonInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    // Email of a user
    public String email;
    public GlipPersonInfo email(String email) {
        this.email = email;
        return this;
    }
    // Photo of a user
    public String avatar;
    public GlipPersonInfo avatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    // Internal identifier of a company
    public String companyId;
    public GlipPersonInfo companyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    // Time of creation in ISO 8601 format
    public String creationTime;
    public GlipPersonInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Time of last modification in ISO 8601 format
    public String lastModifiedTime;
    public GlipPersonInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
