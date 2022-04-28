package com.ringcentral.definitions;


/**
 * This field specifies the dimensions by which the response should be grouped and specific IDs to narrow the response. If this field is undefined or null, the response will contain one record with data aggregated by the whole company
 */
public class PerformanceCallsGrouping {
    /**
     * This field describes the options by which the response should be grouped. See also [Call Aggregate reports](https://developers.ringcentral.com/guide/analytics/aggregate) or [Call Timeline reports](https://developers.ringcentral.com/guide/analytics/timeline) pages in the developer guide for more information.
     * Required
     * Enum: WholeCompany, CompanyNumbers, Users, Queues, IVRs, SharedLines, UserGroups, Sites, Departments, DepartmentMembers, UserGroupMembers, QueueAgents, SiteMembers
     */
    public String groupBy;
    /**
     * This field can be used to specify unique identifiers of groups in GroupBy types
     */
    public String[] ids;

    public PerformanceCallsGrouping groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public PerformanceCallsGrouping ids(String[] ids) {
        this.ids = ids;
        return this;
    }
}
