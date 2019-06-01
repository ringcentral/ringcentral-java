package com.ringcentral.definitions;


public class FederatedAccountResource {
    /**
     *
     */
    public String companyName;
    /**
     *
     */
    public Long conflictCount;
    /**
     *
     */
    public String federatedName;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String linkCreationTime;
    /**
     *
     */
    public PhoneNumberResource mainNumber;

    public FederatedAccountResource companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public FederatedAccountResource conflictCount(Long conflictCount) {
        this.conflictCount = conflictCount;
        return this;
    }

    public FederatedAccountResource federatedName(String federatedName) {
        this.federatedName = federatedName;
        return this;
    }

    public FederatedAccountResource id(String id) {
        this.id = id;
        return this;
    }

    public FederatedAccountResource linkCreationTime(String linkCreationTime) {
        this.linkCreationTime = linkCreationTime;
        return this;
    }

    public FederatedAccountResource mainNumber(PhoneNumberResource mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }

}
