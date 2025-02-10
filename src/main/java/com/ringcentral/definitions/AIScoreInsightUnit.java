package com.ringcentral.definitions;


public class AIScoreInsightUnit {
    /**
     * Value of the score
     * Required
     * Example: 7
     */
    public String value;

    public AIScoreInsightUnit value(String value) {
        this.value = value;
        return this;
    }
}
