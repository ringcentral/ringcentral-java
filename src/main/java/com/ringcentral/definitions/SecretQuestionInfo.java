package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SecretQuestionInfo
{
    // Internal identifier of a question
    public String id;
    public SecretQuestionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Internal identifier of a question type
    public Long questionType;
    public SecretQuestionInfo questionType(Long questionType) {
        this.questionType = questionType;
        return this;
    }
    // Internal identifier of a question language
    public String languageId;
    public SecretQuestionInfo languageId(String languageId) {
        this.languageId = languageId;
        return this;
    }
    // Text of a secret question shown to the end user
    public String questionText;
    public SecretQuestionInfo questionText(String questionText) {
        this.questionText = questionText;
        return this;
    }
    // Specifies if the question is used during signup
    public Boolean showInSignUp;
    public SecretQuestionInfo showInSignUp(Boolean showInSignUp) {
        this.showInSignUp = showInSignUp;
        return this;
    }
}
