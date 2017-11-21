package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdateAccountRequest
{
    // Target account status. For account activation - 'Unconfirmed'. For account confirmation - 'Confirmed'. For changing account status - 'Confirmed' or 'Disabled' = ['Unconfirmed', 'Confirmed', 'Disabled'],
    public String status;
    public UpdateAccountRequest status(String status) {
        this.status = status;
        return this;
    }
    // Status information (reason, comment, lifetime). Returned for 'Disabled' status only
    public AccountStatusInfo statusInfo;
    public UpdateAccountRequest statusInfo(AccountStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    // Email notifications setting
    public TransitionInfo transitionInfo;
    public UpdateAccountRequest transitionInfo(TransitionInfo transitionInfo) {
        this.transitionInfo = transitionInfo;
        return this;
    }
    // Additional account identifier, developed and applied on the client side
    public String partnerId;
    public UpdateAccountRequest partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    // Account service information, including brand, service plan and billing plan
    public AccountServiceInfo serviceInfo;
    public UpdateAccountRequest serviceInfo(AccountServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    // Account level region data (web service Auto-Receptionist settings)
    public RegionalSettings regionalSettings;
    public UpdateAccountRequest regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    // Identifier of extension to be set as operator for account
    public String operatorId;
    public UpdateAccountRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    // Account sign up data
    public SignupInfoResource signupInfo;
    public UpdateAccountRequest signupInfo(SignupInfoResource signupInfo) {
        this.signupInfo = signupInfo;
        return this;
    }
}
