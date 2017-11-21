package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SignupInfoResource
{
    //
    public Boolean tosAccepted;
    public SignupInfoResource tosAccepted(Boolean tosAccepted) {
        this.tosAccepted = tosAccepted;
        return this;
    }
    //
    public String[] signupState;
    public SignupInfoResource signupState(String[] signupState) {
        this.signupState = signupState;
        return this;
    }
    //
    public String verificationReason;
    public SignupInfoResource verificationReason(String verificationReason) {
        this.verificationReason = verificationReason;
        return this;
    }
}
