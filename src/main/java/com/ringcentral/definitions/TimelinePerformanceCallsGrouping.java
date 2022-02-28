package com.ringcentral.definitions;


/**
 * This field specifies the dimensions by which the response should be grouped and specific IDs to narrow the response. If this field is **undefined or null**, the response will contain one record with data aggregated by the whole company
 */
public class TimelinePerformanceCallsGrouping {
    /**
     * This field describes the dimensions by which the response should be grouped. See also *The [Developer Guide](https://developers.ringcentral.com/guide/analytics/timeline)*
     * Required
     * Enum: Users, Queues, IVRs, SharedLines
     */
    public String groupBy;
    /**
     * This field can be used to specify unique identifiers of groups in GroupBy types
     */
    public String[] ids;

    public TimelinePerformanceCallsGrouping groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public TimelinePerformanceCallsGrouping ids(String[] ids) {
        this.ids = ids;
        return this;
    }
}
