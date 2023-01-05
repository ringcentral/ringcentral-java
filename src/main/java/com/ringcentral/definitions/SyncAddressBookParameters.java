package com.ringcentral.definitions;


    /**
* Query parameters for operation syncAddressBook
*/
public class SyncAddressBookParameters
{
    /**
     * Type of synchronization
     * Enum: FSync, ISync
     */
    public String syncType;
    public SyncAddressBookParameters syncType(String syncType)
    {
        this.syncType = syncType;
        return this;
    }

    /**
     * Value of syncToken property of the last sync request response
     */
    public String syncToken;
    public SyncAddressBookParameters syncToken(String syncToken)
    {
        this.syncToken = syncToken;
        return this;
    }

    /**
     * Number of records per page to be returned. Max number of
    * records is 250, which is also the default.
    * For &#039;FSync&#039; - if the number of records exceeds the parameter value
    * (either specified or default), all of the pages can be retrieved
    * in several requests. For &#039;ISync&#039; - if the number of records exceeds
    * page size, then the number of incoming changes to this
    * number is limited
     * Format: int32
     */
    public Long perPage;
    public SyncAddressBookParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Internal identifier of a page. It can be obtained from the &#039;nextPageId&#039;
    * parameter passed in response body
     * Format: int64
     */
    public Long pageId;
    public SyncAddressBookParameters pageId(Long pageId)
    {
        this.pageId = pageId;
        return this;
    }
}