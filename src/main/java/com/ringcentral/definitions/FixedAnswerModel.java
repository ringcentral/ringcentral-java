package com.ringcentral.definitions;


public class FixedAnswerModel
{
    /**
     * ID of the custom question
     * Required
     * Example: 123456789
     */
    public String questionId;
    public FixedAnswerModel questionId(String questionId)
    {
        this.questionId = questionId;
        return this;
    }

    /**
     * The list of answer IDs
     * Required
     */
    public String[] answerIds;
    public FixedAnswerModel answerIds(String[] answerIds)
    {
        this.answerIds = answerIds;
        return this;
    }
}