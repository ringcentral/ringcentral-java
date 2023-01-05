package com.ringcentral.definitions;


public class AccountResource
{
    /**
     * Example: My lovely company
     */
    public String companyName;
    public AccountResource companyName(String companyName)
    {
        this.companyName = companyName;
        return this;
    }

    /**
     * Example: Lovely Holding
     */
    public String federatedName;
    public AccountResource federatedName(String federatedName)
    {
        this.federatedName = federatedName;
        return this;
    }

    /**
     * Required
     * Example: 400131426008
     */
    public String id;
    public AccountResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public PhoneNumberResource mainNumber;
    public AccountResource mainNumber(PhoneNumberResource mainNumber)
    {
        this.mainNumber = mainNumber;
        return this;
    }
}