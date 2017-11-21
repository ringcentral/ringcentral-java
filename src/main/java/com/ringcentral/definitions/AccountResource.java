package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountResource
{
    //
    public String uri;
    public AccountResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public AccountResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public AccountServiceInfoResource serviceInfo;
    public AccountResource serviceInfo(AccountServiceInfoResource serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    //
    public String partnerId;
    public AccountResource partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    //
    public ExtensionResource operator;
    public AccountResource operator(ExtensionResource operator) {
        this.operator = operator;
        return this;
    }
    //
    public String mainNumber;
    public AccountResource mainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }
    //
    public String reservationId;
    public AccountResource reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
    //
    public String sessionId;
    public AccountResource sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    //
    public String status;
    public AccountResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public StatusInfo statusInfo;
    public AccountResource statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    //
    public SignupInfoResource signupInfo;
    public AccountResource signupInfo(SignupInfoResource signupInfo) {
        this.signupInfo = signupInfo;
        return this;
    }
    //
    public String setupWizardState;
    public AccountResource setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    //
    public String[] testerFlags;
    public AccountResource testerFlags(String[] testerFlags) {
        this.testerFlags = testerFlags;
        return this;
    }
    //
    public String promotionCode;
    public AccountResource promotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
}
