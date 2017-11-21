package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionUserCredentailsRequest
{
    // User password of an extension
    public String password;
    public ExtensionUserCredentailsRequest password(String password) {
        this.password = password;
        return this;
    }
    // User pin of an extension
    public String ivrPin;
    public ExtensionUserCredentailsRequest ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    //
    public ExtensionSecretQuestionInfo secretQuestion;
    public ExtensionUserCredentailsRequest secretQuestion(ExtensionSecretQuestionInfo secretQuestion) {
        this.secretQuestion = secretQuestion;
        return this;
    }
}
