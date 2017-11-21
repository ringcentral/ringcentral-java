package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationExtensionInfo
{
    // Internal identifier of an extension of current account
    public String id;
    public FederationExtensionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Number of an extension
    public String extensionNumber;
    public FederationExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Extension user first name
    public String firstName;
    public FederationExtensionInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    // Extension user last name
    public String lastName;
    public FederationExtensionInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    // Conflicting extensions information
    public ConflictsInfo[] conflicts;
    public FederationExtensionInfo conflicts(ConflictsInfo[] conflicts) {
        this.conflicts = conflicts;
        return this;
    }
}
