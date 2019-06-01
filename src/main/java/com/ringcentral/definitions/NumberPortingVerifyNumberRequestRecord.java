package com.ringcentral.definitions;


public class NumberPortingVerifyNumberRequestRecord {
    /**
     * Phone number to verify
     */
    public String phoneNumber;
    /**
     * Is phone number billing phone number or not. Can be specified for one phone number only.
     */
    public Boolean isBillingNumber;

    public NumberPortingVerifyNumberRequestRecord phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public NumberPortingVerifyNumberRequestRecord isBillingNumber(Boolean isBillingNumber) {
        this.isBillingNumber = isBillingNumber;
        return this;
    }

}
