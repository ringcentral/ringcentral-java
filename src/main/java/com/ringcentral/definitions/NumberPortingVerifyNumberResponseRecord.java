package com.ringcentral.definitions;


public class NumberPortingVerifyNumberResponseRecord {
    /**
     * The verified phone number.
     */
    public String phoneNumber;
    /**
     * Is phone number billing phone number or not.
     */
    public Boolean isBillingNumber;
    /**
     * The result of phone number validation, can or not be ported the phone number.
     * Enum: Success, Failure
     */
    public String validationStatus;
    /**
     * The reason why the corresponding phone number can`t be ported.
     */
    public String reason;

    public NumberPortingVerifyNumberResponseRecord phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public NumberPortingVerifyNumberResponseRecord isBillingNumber(Boolean isBillingNumber) {
        this.isBillingNumber = isBillingNumber;
        return this;
    }

    public NumberPortingVerifyNumberResponseRecord validationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
        return this;
    }

    public NumberPortingVerifyNumberResponseRecord reason(String reason) {
        this.reason = reason;
        return this;
    }

}
