package com.ringcentral.definitions;


public class ConversationalInsightsUnit
{
    /**
     * Required
     * Example: KeyPhrases
     * Enum: ExtractiveSummary, AbstractiveSummaryLong, AbstractiveSummaryShort, KeyPhrases, QuestionsAsked, OverallSentiment, Topics
     */
    public String name;
    public ConversationalInsightsUnit name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Required
     */
    public ConversationalInsightsUnitValues[] values;
    public ConversationalInsightsUnit values(ConversationalInsightsUnitValues[] values)
    {
        this.values = values;
        return this;
    }
}