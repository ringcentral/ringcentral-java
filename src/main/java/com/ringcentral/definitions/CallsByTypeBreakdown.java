package com.ringcentral.definitions;


    /**
* Result breakdown by type
*/
public class CallsByTypeBreakdown
{
    /**
     * Value for Direct type
     * Required
     * Format: double
     */
    public Double direct;
    public CallsByTypeBreakdown direct(Double direct)
    {
        this.direct = direct;
        return this;
    }

    /**
     * Value for FromQueue type
     * Required
     * Format: double
     */
    public Double fromQueue;
    public CallsByTypeBreakdown fromQueue(Double fromQueue)
    {
        this.fromQueue = fromQueue;
        return this;
    }

    /**
     * Value for ParkRetrieval type
     * Required
     * Format: double
     */
    public Double parkRetrieval;
    public CallsByTypeBreakdown parkRetrieval(Double parkRetrieval)
    {
        this.parkRetrieval = parkRetrieval;
        return this;
    }

    /**
     * Value for Transferred type
     * Required
     * Format: double
     */
    public Double transferred;
    public CallsByTypeBreakdown transferred(Double transferred)
    {
        this.transferred = transferred;
        return this;
    }

    /**
     * Value for Outbound type
     * Required
     * Format: double
     */
    public Double outbound;
    public CallsByTypeBreakdown outbound(Double outbound)
    {
        this.outbound = outbound;
        return this;
    }

    /**
     * Value for Overflow type
     * Required
     * Format: double
     */
    public Double overflow;
    public CallsByTypeBreakdown overflow(Double overflow)
    {
        this.overflow = overflow;
        return this;
    }
}