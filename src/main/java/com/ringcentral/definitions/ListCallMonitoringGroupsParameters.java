package com.ringcentral.definitions;


    /**
* Query parameters for operation listCallMonitoringGroups
*/
public class ListCallMonitoringGroupsParameters
{
    /**
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Default: 1
     */
    public Long page;
    public ListCallMonitoringGroupsParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    public ListCallMonitoringGroupsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Internal identifier of an extension that is a member of every group within the result
     */
    public String memberExtensionId;
    public ListCallMonitoringGroupsParameters memberExtensionId(String memberExtensionId)
    {
        this.memberExtensionId = memberExtensionId;
        return this;
    }
}