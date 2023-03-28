package com.ringcentral.definitions;


public class AggregationResponseOptionsCountersCallsByOrigin
{
    /**
     * Counter aggregation type. Can be `Sum`, `Average`, `Min`, `Max` or `Percent`
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AggregationResponseOptionsCountersCallsByOrigin aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Time interval which will be used for aggregation. Can be `Hour`, `Day`, `Week` or `Month`
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AggregationResponseOptionsCountersCallsByOrigin aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}