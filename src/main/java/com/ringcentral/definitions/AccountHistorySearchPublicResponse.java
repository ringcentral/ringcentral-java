package com.ringcentral.definitions;


public class AccountHistorySearchPublicResponse
{
    /**
     * List of records
     */
    public AccountHistoryPublicRecord[] records;
    public AccountHistorySearchPublicResponse records(AccountHistoryPublicRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public AccountHistoryPaging paging;
    public AccountHistorySearchPublicResponse paging(AccountHistoryPaging paging)
    {
        this.paging = paging;
        return this;
    }
}