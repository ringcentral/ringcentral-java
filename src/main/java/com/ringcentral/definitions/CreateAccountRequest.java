package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateAccountRequest
{
    // Main account VoIP phone number, either Local or Toll-Free. Cannot be Fax Only. Obtained via lookup/reserve API
    public String mainNumber;
    public CreateAccountRequest mainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }
    // Operator's extension information. This extension will receive all calls and messages intended for the operator
    public GetExtensionInfoResponse operator;
    public CreateAccountRequest operator(GetExtensionInfoResponse operator) {
        this.operator = operator;
        return this;
    }
    // Partner identifier for this account
    public String partnerId;
    public CreateAccountRequest partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    // Promotion code to calculate a discount
    public String promotionCode;
    public CreateAccountRequest promotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    // Internal identifier of phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time
    public String reservationId;
    public CreateAccountRequest reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
    // Account service information, brand identifier and service plan
    public GetServiceInfoResponse serviceInfo;
    public CreateAccountRequest serviceInfo(GetServiceInfoResponse serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    // The status with which an account is created. The default value is 'Initial'
    public String status;
    public CreateAccountRequest status(String status) {
        this.status = status;
        return this;
    }
    // Account sign up data
    public AccountSignupInfoRequest signupInfo;
    public CreateAccountRequest signupInfo(AccountSignupInfoRequest signupInfo) {
        this.signupInfo = signupInfo;
        return this;
    }
}
