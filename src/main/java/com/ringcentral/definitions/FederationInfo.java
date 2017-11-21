package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationInfo
{
    // Internal identifier of a federation
    public String id;
    public FederationInfo id(String id) {
        this.id = id;
        return this;
    }
    // Name of a federation
    public String displayName;
    public FederationInfo displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    // Datetime of federation creation, in ISO 8601 format, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    public FederationInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Datetime of the last change of federation composition, in ISO 8601 format, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    public FederationInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // List of countries which can be selected for a dialing plan
    public FederationAccountInfo[] accounts;
    public FederationInfo accounts(FederationAccountInfo[] accounts) {
        this.accounts = accounts;
        return this;
    }
}
