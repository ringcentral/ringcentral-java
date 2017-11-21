package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationConflictsAccountInfo
{
    // Internal identifier of an account
    public String id;
    public FederationConflictsAccountInfo id(String id) {
        this.id = id;
        return this;
    }
    // Federated name of an account
    public String federatedName;
    public FederationConflictsAccountInfo federatedName(String federatedName) {
        this.federatedName = federatedName;
        return this;
    }
}
