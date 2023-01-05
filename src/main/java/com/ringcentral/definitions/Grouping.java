package com.ringcentral.definitions;


public class Grouping
{
    /**
     * The selected grouping option
     * Enum: Company, CompanyNumbers, Users, Queues, IVRs, SharedLines, UserGroups, Sites, Departments
     */
    public String groupBy;
    public Grouping groupBy(String groupBy)
    {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * This field can be used to further limit the users selection by specifying unique identifiers of corresponding entities. For example, providing unique queue ids along with `Queue` in `groupByMembers` field will limit the response to users that are queue agents in at least one of these queues
     */
    public String[] keys;
    public Grouping keys(String[] keys)
    {
        this.keys = keys;
        return this;
    }

    /**
     * The selected data scope
     * Enum: Department, UserGroup, Queue, Site
     */
    public String groupByMembers;
    public Grouping groupByMembers(String groupByMembers)
    {
        this.groupByMembers = groupByMembers;
        return this;
    }
}