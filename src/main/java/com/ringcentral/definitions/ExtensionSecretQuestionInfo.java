package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionSecretQuestionInfo
{
    // Internal identifier of a secret question
    public String id;
    public ExtensionSecretQuestionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Link to a secret question resource
    public String uri;
    public ExtensionSecretQuestionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Answer to a secret question
    public String answer;
    public ExtensionSecretQuestionInfo answer(String answer) {
        this.answer = answer;
        return this;
    }
}
