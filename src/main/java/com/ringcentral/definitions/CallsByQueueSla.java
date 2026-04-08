package com.ringcentral.definitions;


    /**
* Data for calls with breakdown by queue SLA (InSLA, OutSLA). This counter is only applicable to Queues grouping
*/
public class CallsByQueueSla
{
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public CallsByQueueSla valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public CallsByQueueSlaBreakdown values;
    public CallsByQueueSla values(CallsByQueueSlaBreakdown values)
    {
        this.values = values;
        return this;
    }
}