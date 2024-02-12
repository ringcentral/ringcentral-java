package com.ringcentral.definitions;


public class GetAccountInfoResponse {
    /**
     * Internal identifier of an account
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of an account
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of an account in the billing system
     */
    public String bsid;
    /**
     * Main phone number of the current account
     */
    public String mainNumber;
    /**
     *
     */
    public AccountOperatorInfo operator;
    /**
     * Additional account identifier, created by partner application
     * and applied on client side
     */
    public String partnerId;
    /**
     *
     */
    public ServiceInfo serviceInfo;
    /**
     * Specifies account configuration wizard state (web service setup)
     * Default: NotStarted
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;
    /**
     *
     */
    public SignupInfoResource signupInfo;
    /**
     * Status of the current account
     * Enum: Initial, Confirmed, Unconfirmed, Disabled
     */
    public String status;
    /**
     *
     */
    public AccountStatusInfo statusInfo;
    /**
     *
     */
    public AccountRegionalSettings regionalSettings;
    /**
     * Specifies whether an account is included into any federation
     * of accounts or not
     */
    public Boolean federated;
    /**
     * If outbound call prefix is not specified, or set to null (0),
     * then the parameter is not returned; the supported value range is 2-9
     * Format: int32
     */
    public Long outboundCallPrefix;
    /**
     * Customer facing identifier. Returned for accounts with the
     * turned off PBX features. Equals to main company number in
     * [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
     * (without &quot;+&quot; sign)format
     */
    public String cfid;
    /**
     *
     */
    public AccountLimits limits;

    public GetAccountInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetAccountInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetAccountInfoResponse bsid(String bsid) {
        this.bsid = bsid;
        return this;
    }

    public GetAccountInfoResponse mainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }

    public GetAccountInfoResponse operator(AccountOperatorInfo operator) {
        this.operator = operator;
        return this;
    }

    public GetAccountInfoResponse partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public GetAccountInfoResponse serviceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }

    public GetAccountInfoResponse setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public GetAccountInfoResponse signupInfo(SignupInfoResource signupInfo) {
        this.signupInfo = signupInfo;
        return this;
    }

    public GetAccountInfoResponse status(String status) {
        this.status = status;
        return this;
    }

    public GetAccountInfoResponse statusInfo(AccountStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public GetAccountInfoResponse regionalSettings(AccountRegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public GetAccountInfoResponse federated(Boolean federated) {
        this.federated = federated;
        return this;
    }

    public GetAccountInfoResponse outboundCallPrefix(Long outboundCallPrefix) {
        this.outboundCallPrefix = outboundCallPrefix;
        return this;
    }

    public GetAccountInfoResponse cfid(String cfid) {
        this.cfid = cfid;
        return this;
    }

    public GetAccountInfoResponse limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }
}
