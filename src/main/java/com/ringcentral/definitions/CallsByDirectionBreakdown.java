package com.ringcentral.definitions;


    /**
* Result breakdown by direction
*/
public class CallsByDirectionBreakdown
{
    /**
     * Value for Inbound direction
     * Required
     * Format: double
     */
    public Double inbound;
    public CallsByDirectionBreakdown inbound(Double inbound)
    {
        this.inbound = inbound;
        return this;
    }

    /**
     * Value for Outbound direction
     * Required
     * Format: double
     */
    public Double outbound;
    public CallsByDirectionBreakdown outbound(Double outbound)
    {
        this.outbound = outbound;
        return this;
    }
}