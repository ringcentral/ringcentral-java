package com.ringcentral.definitions;

public class RegAnswerModel {
    /** ID of the custom question Required Example: 123456789 */
    public String questionId;

    public RegAnswerModel questionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /** The list of answer IDs Required */
    public String[] answerIds;

    public RegAnswerModel answerIds(String[] answerIds) {
        this.answerIds = answerIds;
        return this;
    }

    /** Answer text Required */
    public String answerText;

    public RegAnswerModel answerText(String answerText) {
        this.answerText = answerText;
        return this;
    }
}
