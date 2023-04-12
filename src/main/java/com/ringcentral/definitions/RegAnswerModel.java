package com.ringcentral.definitions;


public class RegAnswerModel {
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
    /**
     * Answer text
     * Required
     */
    public String answerText;

    public RegAnswerModel questionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    public RegAnswerModel answerIds(String[] answerIds) {
        this.answerIds = answerIds;
        return this;
    }

    public RegAnswerModel answerText(String answerText) {
        this.answerText = answerText;
        return this;
    }
}
