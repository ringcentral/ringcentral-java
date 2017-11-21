package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class VerifyExtensionUserCredentials
{
    // User password of an extension
    public String password;
    public VerifyExtensionUserCredentials password(String password) {
        this.password = password;
        return this;
    }
    // User pin of an extension
    public String ivrPin;
    public VerifyExtensionUserCredentials ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    // Secret question of an extension user
    public SecretQuestionInfoVerificationRequest secretQuestion;
    public VerifyExtensionUserCredentials secretQuestion(SecretQuestionInfoVerificationRequest secretQuestion) {
        this.secretQuestion = secretQuestion;
        return this;
    }
}
