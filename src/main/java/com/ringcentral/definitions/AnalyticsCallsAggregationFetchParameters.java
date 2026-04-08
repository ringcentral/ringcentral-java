package com.ringcentral.definitions;


    /**
* Query parameters for operation analyticsCallsAggregationFetch
*/
public class AnalyticsCallsAggregationFetchParameters
{
    /**
     * The current page number (positive numbers only)
     * Minimum: 1
     * Format: int32
     */
    public Long page;
    public AnalyticsCallsAggregationFetchParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Number of records displayed on a page (positive numbers only, max value of 200)
     * Maximum: 200
     * Minimum: 1
     * Format: int32
     */
    public Long perPage;
    public AnalyticsCallsAggregationFetchParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}