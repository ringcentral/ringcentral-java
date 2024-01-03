package com.ringcentral.definitions;


public class AccountHistorySearchPublicResponse {
    /**
     * List of records
     */
    public AccountHistoryPublicRecord[] records;
    /**
     *
     */
    public AccountHistoryPaging paging;

    public AccountHistorySearchPublicResponse records(AccountHistoryPublicRecord[] records) {
        this.records = records;
        return this;
    }

    public AccountHistorySearchPublicResponse paging(AccountHistoryPaging paging) {
        this.paging = paging;
        return this;
    }
}
