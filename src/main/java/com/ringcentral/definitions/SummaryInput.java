package com.ringcentral.definitions;


public class SummaryInput {
    /**
     * Type of summary to be computed
     * Required
     * Example: AbstractiveShort
     * Enum: Extractive, AbstractiveShort, AbstractiveLong, AbstractiveAll, All
     */
    public String summaryType;
    /**
     * Required
     */
    public SummaryUnit[] utterances;

    public SummaryInput summaryType(String summaryType) {
        this.summaryType = summaryType;
        return this;
    }

    public SummaryInput utterances(SummaryUnit[] utterances) {
        this.utterances = utterances;
        return this;
    }
}
