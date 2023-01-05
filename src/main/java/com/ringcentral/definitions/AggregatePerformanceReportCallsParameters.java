package com.ringcentral.definitions;


    /**
* Query parameters for operation aggregatePerformanceReportCalls
*/
public class AggregatePerformanceReportCallsParameters
{
    /**
     * The current page number
     * Minimum: 1
     * Format: int32
     */
    public Long page;
    public AggregatePerformanceReportCallsParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Number of records displayed on a page
     * Format: int32
     */
    public Long perPage;
    public AggregatePerformanceReportCallsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}