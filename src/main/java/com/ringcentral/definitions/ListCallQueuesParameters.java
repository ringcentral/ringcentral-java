package com.ringcentral.definitions;


    /**
* Query parameters for operation listCallQueues
*/
public class ListCallQueuesParameters
{
    /**
     * Indicates a page number to retrieve. Only positive number values
    * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListCallQueuesParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ListCallQueuesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Internal identifier of an extension that is a member of every
    * group within the result
     */
    public String memberExtensionId;
    public ListCallQueuesParameters memberExtensionId(String memberExtensionId)
    {
        this.memberExtensionId = memberExtensionId;
        return this;
    }
}