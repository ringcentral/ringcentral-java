package com.ringcentral.definitions;


/**
 * This grouping allows to specify the `groupBy` option by which the data in the response will be grouped
 */
public class DirectGrouping {
    /**
     * The selected grouping option
     * Required
     * Enum: Company, CompanyNumbers, Users, Queues, IVRs, SharedLines, UserGroups, Sites, Departments
     */
    public String groupBy;
    /**
     * This field can be used to specify unique identifiers of entities selected in `groupBy` field. The response data will be limited to these entities only
     */
    public String[] keys;

    public DirectGrouping groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public DirectGrouping keys(String[] keys) {
        this.keys = keys;
        return this;
    }
}
