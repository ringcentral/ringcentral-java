package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ConflictsInfo
{
    // Internal identifier of a conflicting extension assigned to another account of the current federation
    public String id;
    public ConflictsInfo id(String id) {
        this.id = id;
        return this;
    }
    // Extension user first name
    public String firstName;
    public ConflictsInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    // Extension user last name
    public String lastName;
    public ConflictsInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    // Account data of an extension
    public FederationConflictsAccountInfo account;
    public ConflictsInfo account(FederationConflictsAccountInfo account) {
        this.account = account;
        return this;
    }
}
