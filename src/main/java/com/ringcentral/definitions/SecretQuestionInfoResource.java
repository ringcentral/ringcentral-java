package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SecretQuestionInfoResource
{
    //
    public String uri;
    public SecretQuestionInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public SecretQuestionInfoResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public Long questionType;
    public SecretQuestionInfoResource questionType(Long questionType) {
        this.questionType = questionType;
        return this;
    }
    //
    public Long languageId;
    public SecretQuestionInfoResource languageId(Long languageId) {
        this.languageId = languageId;
        return this;
    }
    //
    public String questionText;
    public SecretQuestionInfoResource questionText(String questionText) {
        this.questionText = questionText;
        return this;
    }
    //
    public Boolean showInSignUp;
    public SecretQuestionInfoResource showInSignUp(Boolean showInSignUp) {
        this.showInSignUp = showInSignUp;
        return this;
    }
}
