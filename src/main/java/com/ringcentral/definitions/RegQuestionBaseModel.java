package com.ringcentral.definitions;


public class RegQuestionBaseModel {
    /**
     * ID of the custom question
     * Required
     * Example: 123456789
     */
    public String questionId;

    public RegQuestionBaseModel questionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
}
