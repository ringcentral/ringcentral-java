package com.ringcentral.definitions;


public class SummaryInput
{
    /**
     * Type of summary to be computed
     * Required
     * Example: AbstractiveShort
     * Enum: Extractive, AbstractiveShort, AbstractiveLong, AbstractiveAll, All
     */
    public String summaryType;
    public SummaryInput summaryType(String summaryType)
    {
        this.summaryType = summaryType;
        return this;
    }

    /**
     * Required
     */
    public SummaryUnit[] utterances;
    public SummaryInput utterances(SummaryUnit[] utterances)
    {
        this.utterances = utterances;
        return this;
    }
}