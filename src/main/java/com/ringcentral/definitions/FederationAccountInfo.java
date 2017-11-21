package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationAccountInfo
{
    // Internal identifier of an account
    public String id;
    public FederationAccountInfo id(String id) {
        this.id = id;
        return this;
    }
    // Company name of an account
    public String companyName;
    public FederationAccountInfo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    // Federation name of an account
    public String federatedName;
    public FederationAccountInfo federatedName(String federatedName) {
        this.federatedName = federatedName;
        return this;
    }
    // Datetime when this account was linked to a federation, in ISO 8601 format, for example 2016-03-10T18:07:52.534Z
    public String linkCreationTime;
    public FederationAccountInfo linkCreationTime(String linkCreationTime) {
        this.linkCreationTime = linkCreationTime;
        return this;
    }
    // Main company number information
    public FederationMainNumberInfo mainNumber;
    public FederationAccountInfo mainNumber(FederationMainNumberInfo mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }
    // Count of federation extension numbers conflicting with extension numbers of the requested account. For extension numbers of the requested account the value of this parameter is '0'
    public Long conflictCount;
    public FederationAccountInfo conflictCount(Long conflictCount) {
        this.conflictCount = conflictCount;
        return this;
    }
}
