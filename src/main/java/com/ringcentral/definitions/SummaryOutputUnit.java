package com.ringcentral.definitions;


public class SummaryOutputUnit {
    /**
     * Example: AbstractiveShort
     * Enum: Extractive, AbstractiveLong, AbstractiveShort, All
     */
    public String name;
    /**
     * Summary output units sorted by their occurrence in the conversation
     */
    public SummaryTimingsUnit[] values;

    public SummaryOutputUnit name(String name) {
        this.name = name;
        return this;
    }

    public SummaryOutputUnit values(SummaryTimingsUnit[] values) {
        this.values = values;
        return this;
    }
}
