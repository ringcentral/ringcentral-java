package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SecretQuestionInfoVerificationRequest
{
    // Internal identifier of a secret question
    public String id;
    public SecretQuestionInfoVerificationRequest id(String id) {
        this.id = id;
        return this;
    }
    // Answer to a secret question
    public String answer;
    public SecretQuestionInfoVerificationRequest answer(String answer) {
        this.answer = answer;
        return this;
    }
}
