package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionUserCredentials
{
    // Secret question of an extension user
    public SecretQuestionInfo secretQuestion;
    public ExtensionUserCredentials secretQuestion(SecretQuestionInfo secretQuestion) {
        this.secretQuestion = secretQuestion;
        return this;
    }
}
