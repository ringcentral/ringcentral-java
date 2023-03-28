package com.ringcentral.definitions;


/**
 * This grouping allows to specify the `groupByMembers` option. The response data will be grouped by users and will only include users that belong to the scope selected in `groupByMembers` field
 */
public class Grouping {
    /**
     * The selected grouping option
     * Required
     * Enum: Company, CompanyNumbers, Users, Queues, IVRs, SharedLines, UserGroups, Sites, Departments
     */
    public String groupBy;
    /**
     * This field can be used to further limit the users selection by specifying unique identifiers of corresponding entities. For example, providing unique queue ids along with `Queue` in `groupByMembers` field will limit the response to users that are queue agents in at least one of these queues
     */
    public String[] keys;
    /**
     * The selected data scope
     * Required
     * Enum: Department, UserGroup, Queue, Site
     */
    public String groupByMembers;

    public Grouping groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public Grouping keys(String[] keys) {
        this.keys = keys;
        return this;
    }

    public Grouping groupByMembers(String groupByMembers) {
        this.groupByMembers = groupByMembers;
        return this;
    }
}
