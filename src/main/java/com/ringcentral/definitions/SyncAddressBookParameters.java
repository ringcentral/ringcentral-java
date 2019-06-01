package com.ringcentral.definitions;


public class SyncAddressBookParameters {
    /**
     * Type of synchronization
     */
    public String[] syncType;
    /**
     * Value of syncToken property of the last sync request response
     */
    public String syncToken;
    /**
     * Number of records per page to be returned. The max number of records is 250, which is also the default. For 'FSync' if the number of records exceeds the parameter value (either specified or default), all of the pages can be retrieved in several requests. For 'ISync' if the number of records exceeds the page size, the number of incoming changes to this number is limited
     */
    public Long perPage;
    /**
     * Internal identifier of a page. It can be obtained from the 'nextPageId' parameter passed in response body
     */
    public Long pageId;

    public SyncAddressBookParameters syncType(String[] syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncAddressBookParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncAddressBookParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public SyncAddressBookParameters pageId(Long pageId) {
        this.pageId = pageId;
        return this;
    }

}
