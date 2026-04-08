package com.ringcentral.definitions;


public class SentimentInsightUnit
{
    /**
     * Sentiment value
     * Required
     * Example: Positive
     * Enum: Positive, Negative, Neutral
     */
    public String value;
    public SentimentInsightUnit value(String value)
    {
        this.value = value;
        return this;
    }
}