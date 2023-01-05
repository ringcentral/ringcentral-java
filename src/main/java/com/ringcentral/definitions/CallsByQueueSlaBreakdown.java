package com.ringcentral.definitions;


    /**
* Result breakdown by queue SLA
*/
public class CallsByQueueSlaBreakdown
{
    /**
     * Value for InSla queue SLA
     * Required
     * Format: double
     */
    public Double inSla;
    public CallsByQueueSlaBreakdown inSla(Double inSla)
    {
        this.inSla = inSla;
        return this;
    }

    /**
     * Value for OutSla queue SLA
     * Required
     * Format: double
     */
    public Double outOfSla;
    public CallsByQueueSlaBreakdown outOfSla(Double outOfSla)
    {
        this.outOfSla = outOfSla;
        return this;
    }
}