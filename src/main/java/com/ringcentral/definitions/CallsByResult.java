package com.ringcentral.definitions;


    /**
* Data for calls with breakdown by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
*/
public class CallsByResult
{
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public CallsByResult valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public CallsByResultBreakdown values;
    public CallsByResult values(CallsByResultBreakdown values)
    {
        this.values = values;
        return this;
    }
}