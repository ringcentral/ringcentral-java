package com.ringcentral.definitions;

public class AccountInfo {
    // Internal identifier of an account
    public String id;
    // Canonical URI of an account
    public String uri;
    // Main phone number of the current account
    public String mainNumber;
    // Operator's extension information. This extension will receive all calls and messages intended for the operator
    public ExtensionInfo operator;
    // Additional account identifier, developed and applied by the client
    public String partnerId;
    // Account service information, including brand, service plan and billing plan
    public Account_ServiceInfo serviceInfo;
    // Specifies account configuration wizard state (web service setup). The default value is 'NotStarted'
    public String setupWizardState;
    // Status of the current account
    public String status;
    // Status information (reason, comment, lifetime). Returned for 'Disabled' status only
    public StatusInfo statusInfo;

    public AccountInfo id(String id) {
        this.id = id;
        return this;
    }

    public AccountInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountInfo mainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }

    public AccountInfo operator(ExtensionInfo operator) {
        this.operator = operator;
        return this;
    }

    public AccountInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public AccountInfo serviceInfo(Account_ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }

    public AccountInfo setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public AccountInfo status(String status) {
        this.status = status;
        return this;
    }

    public AccountInfo statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
}
