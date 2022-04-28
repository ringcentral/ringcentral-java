package com.ringcentral.definitions;


/**
 * Query parameters for operation aggregatePerformanceReportCalls
 */
public class AggregatePerformanceReportCallsParameters {
    /**
     * The current page number
     * Minimum: 1
     */
    public Long page;
    /**
     * Number of records displayed on a page
     */
    public Long perPage;

    public AggregatePerformanceReportCallsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public AggregatePerformanceReportCallsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
