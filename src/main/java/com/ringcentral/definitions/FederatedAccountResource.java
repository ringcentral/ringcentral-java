package com.ringcentral.definitions;


public class FederatedAccountResource
{
    /**
     */
    public String companyName;
    public FederatedAccountResource companyName(String companyName)
    {
        this.companyName = companyName;
        return this;
    }

    /**
     * Format: int32
     */
    public Long conflictCount;
    public FederatedAccountResource conflictCount(Long conflictCount)
    {
        this.conflictCount = conflictCount;
        return this;
    }

    /**
     */
    public String federatedName;
    public FederatedAccountResource federatedName(String federatedName)
    {
        this.federatedName = federatedName;
        return this;
    }

    /**
     * Required
     */
    public String id;
    public FederatedAccountResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Format: date-time
     */
    public String linkCreationTime;
    public FederatedAccountResource linkCreationTime(String linkCreationTime)
    {
        this.linkCreationTime = linkCreationTime;
        return this;
    }

    /**
     */
    public PhoneNumberResource mainNumber;
    public FederatedAccountResource mainNumber(PhoneNumberResource mainNumber)
    {
        this.mainNumber = mainNumber;
        return this;
    }
}