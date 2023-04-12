package com.ringcentral.definitions;


public class FixedAnswerModel {
    /**
     * ID of the custom question
     * Required
     * Example: 123456789
     */
    public String questionId;
    /**
     * The list of answer IDs
     * Required
     */
    public String[] answerIds;

    public FixedAnswerModel questionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    public FixedAnswerModel answerIds(String[] answerIds) {
        this.answerIds = answerIds;
        return this;
    }
}
