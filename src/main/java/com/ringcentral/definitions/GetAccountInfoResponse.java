package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetAccountInfoResponse
{
    // Internal identifier of an account
    public String id;
    public GetAccountInfoResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an account
    public String uri;
    public GetAccountInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Main phone number of the current account
    public String mainNumber;
    public GetAccountInfoResponse mainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }
    // Operator's extension information. This extension will receive all calls and messages intended for the operator
    public GetExtensionInfoResponse operator;
    public GetAccountInfoResponse operator(GetExtensionInfoResponse operator) {
        this.operator = operator;
        return this;
    }
    // Additional account identifier, developed and applied by the client
    public String partnerId;
    public GetAccountInfoResponse partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    // Account service information, including brand, service plan and billing plan
    public ServiceInfo serviceInfo;
    public GetAccountInfoResponse serviceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    // Specifies account configuration wizard state (web service setup). The default value is 'NotStarted'
    public String setupWizardState;
    public GetAccountInfoResponse setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    // Status of the current account
    public String status;
    public GetAccountInfoResponse status(String status) {
        this.status = status;
        return this;
    }
    // Status information (reason, comment, lifetime). Returned for 'Disabled' status only
    public AccountStatusInfo statusInfo;
    public GetAccountInfoResponse statusInfo(AccountStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    // Account level region data (web service Auto-Receptionist settings)
    public RegionalSettings regionalSettings;
    public GetAccountInfoResponse regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    // Specifies whether an account is included into any federation of accounts or not
    public Boolean federated;
    public GetAccountInfoResponse federated(Boolean federated) {
        this.federated = federated;
        return this;
    }
}
