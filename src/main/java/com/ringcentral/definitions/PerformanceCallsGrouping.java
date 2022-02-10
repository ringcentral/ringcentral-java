package com.ringcentral.definitions;


/**
 * This field specifies the dimensions by which the response should be grouped
 * and specific ids to narrow the response.
 * * If this field is **undefined or null**, the response will contain one record
 * with data aggregated by the whole company.
 * * `CompanyNumbers` - Keys expected in ids array and returned in response:
 * company numbers in E164 format.
 * * `Users` - Keys expected in ids array and returned in response:
 * user extension ids.
 * * `Queues` - Keys expected in ids array and returned in response:
 * queue extension ids.
 * * `IVRs` - Keys expected in ids array and returned in response:
 * IVR extension ids.
 * * `UserGroups` - Keys expected in ids array and returned in response:
 * user group extension ids.
 * * `Sites` - Keys expected in ids array and returned in response:
 * site extension ids.
 * * `SharedLines` - Keys expected in ids array and returned in response:
 * shared lines extension ids.
 * * `Departments` - Keys expected in ids array and returned in response:
 * department names.
 * * `DepartmentMembers` - Keys expected in ids array: department names.
 * Keys returned in response: user extension ids.
 * If ids array is empty or not defined, the response will include all users
 * that are assigned to a department.
 * * `UserGroupMembers` - Keys expected in ids array: user group extension ids.
 * Keys returned in response: user extension ids.
 * If ids array is empty or not defined, the response will include all users
 * that are assigned to a user group.
 * * `QueueAgents` - Keys expected in ids array: queue extension ids.
 * Keys returned in response: user extension ids.
 * If ids array is empty or not defined, the response will include all users
 * that are queue members.
 * * `SiteMembers` - Keys expected in ids array: site extension ids.
 * Keys returned in response: user extension ids.
 * If ids array is empty or not defined, the response will include all users
 * that are site members.
 */
public class PerformanceCallsGrouping {
    /**
     * This field describes the dimensions by which the response should be grouped
     * Required
     * Enum: CompanyNumbers, Users, Queues, IVRs, SharedLines, UserGroups, Sites, Departments, DepartmentMembers, UserGroupMembers, QueueAgents, SiteMembers
     */
    public String groupBy;
    /**
     * This field can be used to specify unique identifiers of groups in GroupBy types.
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
