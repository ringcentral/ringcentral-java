package com.ringcentral.definitions;


public class AccountResource {
    /**
     * Example: My lovely company
     */
    public String companyName;
    /**
     * Example: Lovely Holding
     */
    public String federatedName;
    /**
     * Required
     * Example: 400131426008
     */
    public String id;
    /**
     *
     */
    public AdgPhoneNumberResource mainNumber;

    public AccountResource companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public AccountResource federatedName(String federatedName) {
        this.federatedName = federatedName;
        return this;
    }

    public AccountResource id(String id) {
        this.id = id;
        return this;
    }

    public AccountResource mainNumber(AdgPhoneNumberResource mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }
}
