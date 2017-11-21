package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ValidateExtensionUserCredentials
{
    // User password of an extension
    public String password;
    public ValidateExtensionUserCredentials password(String password) {
        this.password = password;
        return this;
    }
    // User pin of an extension
    public String ivrPin;
    public ValidateExtensionUserCredentials ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    // Secret question of an extension user
    public SecretQuestionInfoValidationRequest secretQuestion;
    public ValidateExtensionUserCredentials secretQuestion(SecretQuestionInfoValidationRequest secretQuestion) {
        this.secretQuestion = secretQuestion;
        return this;
    }
}
