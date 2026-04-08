package com.ringcentral.definitions;

public class VariableAnswerModel {
    /** ID of the custom question Required Example: 123456789 */
    public String questionId;

    public VariableAnswerModel questionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /** Answer text Required */
    public String answerText;

    public VariableAnswerModel answerText(String answerText) {
        this.answerText = answerText;
        return this;
    }
}
