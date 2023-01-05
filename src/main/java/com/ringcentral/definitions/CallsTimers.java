package com.ringcentral.definitions;


    /**
* Call length data for the specified grouping
*/
public class CallsTimers
{
    /**
     */
    public AllCalls allCalls;
    public CallsTimers allCalls(AllCalls allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public CallsByDirection callsByDirection;
    public CallsTimers callsByDirection(CallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public CallsByOrigin callsByOrigin;
    public CallsTimers callsByOrigin(CallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public CallsByResponse callsByResponse;
    public CallsTimers callsByResponse(CallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public CallsBySegments callsSegments;
    public CallsTimers callsSegments(CallsBySegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public CallsByResult callsByResult;
    public CallsTimers callsByResult(CallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public CallsByCompanyHours callsByCompanyHours;
    public CallsTimers callsByCompanyHours(CallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     */
    public CallsByQueueSla callsByQueueSla;
    public CallsTimers callsByQueueSla(CallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public CallsByType callsByType;
    public CallsTimers callsByType(CallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }
}