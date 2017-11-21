package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SecretQuestionInfoValidationRequest
{
    // Internal identifier of a secret question
    public String id;
    public SecretQuestionInfoValidationRequest id(String id) {
        this.id = id;
        return this;
    }
    // Answer to a secret question
    public String answer;
    public SecretQuestionInfoValidationRequest answer(String answer) {
        this.answer = answer;
        return this;
    }
}
