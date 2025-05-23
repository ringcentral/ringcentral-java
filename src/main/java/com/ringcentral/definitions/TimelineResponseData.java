package com.ringcentral.definitions;


/**
 * A list of time-value points of call data as per the grouping and filtering options specified in the request
 */
public class TimelineResponseData {
    /**
     * The selected grouping option
     * Required
     * Enum: Company, CompanyNumbers, Users, Queues, IVRs, IVAs, SharedLines, UserGroups, Sites, Departments
     */
    public String groupedBy;
    /**
     * List of call data as per the grouping and filtering options specified in the request
     */
    public TimelineResponseRecord[] records;

    public TimelineResponseData groupedBy(String groupedBy) {
        this.groupedBy = groupedBy;
        return this;
    }

    public TimelineResponseData records(TimelineResponseRecord[] records) {
        this.records = records;
        return this;
    }
}
