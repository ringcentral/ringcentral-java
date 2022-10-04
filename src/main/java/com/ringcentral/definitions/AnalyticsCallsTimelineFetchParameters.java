package com.ringcentral.definitions;


/**
 * Query parameters for operation analyticsCallsTimelineFetch
 */
public class AnalyticsCallsTimelineFetchParameters {
    /**
     * Aggregation interval
     * Enum: Hour, Day, Week, Month
     */
    public String interval;
    /**
     * The current page number (positive numbers only)
     * Minimum: 1
     * Format: int32
     */
    public Long page;
    /**
     * Number of records displayed on a page (positive numbers only, max value of 20)
     * Maximum: 20
     * Minimum: 1
     * Format: int32
     */
    public Long perPage;

    public AnalyticsCallsTimelineFetchParameters interval(String interval) {
        this.interval = interval;
        return this;
    }

    public AnalyticsCallsTimelineFetchParameters page(Long page) {
        this.page = page;
        return this;
    }

    public AnalyticsCallsTimelineFetchParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
