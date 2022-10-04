package com.ringcentral.definitions;


/**
 * This grouping allows to specify the `groupByMembers` option. The response data will be grouped by users and will only include users that belong to the scope selected in `groupByMembers` field
 */
public class GroupingByMembers {
    /**
     * The selected data scope
     * Required
     * Enum: Department, UserGroup, Queue, Site
     */
    public String groupByMembers;
    /**
     * This field can be used to further limit the users selection by specifying unique identifiers of corresponding entities. For example, providing unique queue ids along with `Queue` in `groupByMembers` field will limit the response to users that are queue agents in at least one of these queues
     */
    public String[] keys;

    public GroupingByMembers groupByMembers(String groupByMembers) {
        this.groupByMembers = groupByMembers;
        return this;
    }

    public GroupingByMembers keys(String[] keys) {
        this.keys = keys;
        return this;
    }
}
