package com.ringcentral.definitions;


    /**
* Call volume data for the specified grouping
*/
public class CallsCounters
{
    /**
     */
    public AllCalls allCalls;
    public CallsCounters allCalls(AllCalls allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public CallsByDirection callsByDirection;
    public CallsCounters callsByDirection(CallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public CallsByOrigin callsByOrigin;
    public CallsCounters callsByOrigin(CallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public CallsByResponse callsByResponse;
    public CallsCounters callsByResponse(CallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public CallsBySegments callsSegments;
    public CallsCounters callsSegments(CallsBySegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public CallsByResult callsByResult;
    public CallsCounters callsByResult(CallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public CallsByActions callsActions;
    public CallsCounters callsActions(CallsByActions callsActions)
    {
        this.callsActions = callsActions;
        return this;
    }

    /**
     */
    public CallsByCompanyHours callsByCompanyHours;
    public CallsCounters callsByCompanyHours(CallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     */
    public CallsByQueueSla callsByQueueSla;
    public CallsCounters callsByQueueSla(CallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public CallsByType callsByType;
    public CallsCounters callsByType(CallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }

    /**
     */
    public QueueOpportunities queueOpportunities;
    public CallsCounters queueOpportunities(QueueOpportunities queueOpportunities)
    {
        this.queueOpportunities = queueOpportunities;
        return this;
    }
}