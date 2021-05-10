package com.ringcentral.definitions;


// Account sign up data
public class SignupInfoResource {
    /**
     *
     */
    public Boolean tosAccepted;
    /**
     * Enum: AccountCreated, BillingEntered, CreditCardApproved, AccountConfirmed, PhoneVerificationRequired, PhoneVerificationPassed
     */
    public String[] signupState;
    /**
     * Enum: CC_Failed, Phone_Suspicious, CC_Phone_Not_Match, AVS_Not_Available, MaxMind, CC_Blacklisted, Email_Blacklisted, Phone_Blacklisted, Cookie_Blacklisted, Device_Blacklisted, IP_Blacklisted, Agent_Instance_Blacklisted, Charge_Limit, Other_Country, Unknown
     */
    public String verificationReason;
    /**
     * Updates 'Send Marketing Information' flag on web interface
     */
    public Boolean marketingAccepted;

    public SignupInfoResource tosAccepted(Boolean tosAccepted) {
        this.tosAccepted = tosAccepted;
        return this;
    }

    public SignupInfoResource signupState(String[] signupState) {
        this.signupState = signupState;
        return this;
    }

    public SignupInfoResource verificationReason(String verificationReason) {
        this.verificationReason = verificationReason;
        return this;
    }

    public SignupInfoResource marketingAccepted(Boolean marketingAccepted) {
        this.marketingAccepted = marketingAccepted;
        return this;
    }
}
