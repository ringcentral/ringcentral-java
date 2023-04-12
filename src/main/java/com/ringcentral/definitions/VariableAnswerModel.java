package com.ringcentral.definitions;


public class VariableAnswerModel {
    /**
     * ID of the custom question
     * Required
     * Example: 123456789
     */
    public String questionId;
    /**
     * Answer text
     * Required
     */
    public String answerText;

    public VariableAnswerModel questionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    public VariableAnswerModel answerText(String answerText) {
        this.answerText = answerText;
        return this;
    }
}
