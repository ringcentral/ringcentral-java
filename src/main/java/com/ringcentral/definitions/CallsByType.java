package com.ringcentral.definitions;


    /**
* Data for calls with breakdown by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound, Overflow)
*/
public class CallsByType
{
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public CallsByType valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public CallsByTypeBreakdown values;
    public CallsByType values(CallsByTypeBreakdown values)
    {
        this.values = values;
        return this;
    }
}