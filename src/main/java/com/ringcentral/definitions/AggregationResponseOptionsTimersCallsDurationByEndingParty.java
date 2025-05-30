package com.ringcentral.definitions;


public class AggregationResponseOptionsTimersCallsDurationByEndingParty {
    /**
     * Counter aggregation type. Can be `Sum`, `Average`, `Min`, `Max` or `Percent`
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Time interval which will be used for aggregation. Can be `Hour`, `Day`, `Week` or `Month`
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public AggregationResponseOptionsTimersCallsDurationByEndingParty aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public AggregationResponseOptionsTimersCallsDurationByEndingParty aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
