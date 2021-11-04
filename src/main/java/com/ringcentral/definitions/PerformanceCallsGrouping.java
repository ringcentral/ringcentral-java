package com.ringcentral.definitions;


// Grouping options resource defining the parameters by which the report call data will be grouped. If not specified then the whole company data will be returned.
public class PerformanceCallsGrouping {
    /**
     * Specifies parameters by which the response should be grouped
     * Required
     * Enum: CompanyNumbers, Users, Queues, IVRs, UserGroups, Sites, Departments, DepartmentMembers, UserGroupMembers, QueueAgents, SiteMembers
     */
    public String groupBy;
    /**
     * Internal identifiers of groups for &#039;groupBy&#039; types. Required for &#039;DepartmentMembers&#039;, &#039;UserGroupMembers&#039;, &#039;QueueAgents&#039; and &#039;SiteMembers&#039; grouping values.
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
