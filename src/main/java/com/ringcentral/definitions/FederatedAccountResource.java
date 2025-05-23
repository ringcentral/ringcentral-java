package com.ringcentral.definitions;


public class FederatedAccountResource {
    /**
     *
     */
    public String companyName;
    /**
     * Format: int32
     */
    public Long conflictCount;
    /**
     *
     */
    public String federatedName;
    /**
     * Required
     */
    public String id;
    /**
     * Format: date-time
     */
    public String linkCreationTime;
    /**
     *
     */
    public AdgPhoneNumberResource mainNumber;

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

    public FederatedAccountResource mainNumber(AdgPhoneNumberResource mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }
}
