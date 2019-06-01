package com.ringcentral.definitions;


public class AccountResource {
    /**
     *
     */
    public String companyName;
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
    public PhoneNumberResource mainNumber;

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

    public AccountResource mainNumber(PhoneNumberResource mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }

}
