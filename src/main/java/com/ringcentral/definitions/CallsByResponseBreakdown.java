package com.ringcentral.definitions;


    /**
* Result breakdown by response
*/
public class CallsByResponseBreakdown
{
    /**
     * Value for Answered response
     * Required
     * Format: double
     */
    public Double answered;
    public CallsByResponseBreakdown answered(Double answered)
    {
        this.answered = answered;
        return this;
    }

    /**
     * Value for NotAnswered response
     * Required
     * Format: double
     */
    public Double notAnswered;
    public CallsByResponseBreakdown notAnswered(Double notAnswered)
    {
        this.notAnswered = notAnswered;
        return this;
    }

    /**
     * Value for Connected response
     * Required
     * Format: double
     */
    public Double connected;
    public CallsByResponseBreakdown connected(Double connected)
    {
        this.connected = connected;
        return this;
    }

    /**
     * Value for NotConnected response
     * Required
     * Format: double
     */
    public Double notConnected;
    public CallsByResponseBreakdown notConnected(Double notConnected)
    {
        this.notConnected = notConnected;
        return this;
    }
}