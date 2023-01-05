package com.ringcentral.definitions;


    /**
* Aggregation result
*/
public class AggregationResponseData
{
    /**
     * The selected grouping option
     * Required
     * Enum: Company, CompanyNumbers, Users, Queues, IVRs, SharedLines, UserGroups, Sites, Departments
     */
    public String groupedBy;
    public AggregationResponseData groupedBy(String groupedBy)
    {
        this.groupedBy = groupedBy;
        return this;
    }

    /**
     * A list of call aggregations as per the grouping and filtering options specified in the request
     */
    public AggregationResponseRecord[] records;
    public AggregationResponseData records(AggregationResponseRecord[] records)
    {
        this.records = records;
        return this;
    }
}