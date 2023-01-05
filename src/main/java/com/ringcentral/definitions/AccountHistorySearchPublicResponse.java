package com.ringcentral.definitions;


public class AccountHistorySearchPublicResponse
{
    /**
     * List of Records
     */
    public AccountHistoryPublicRecord[] records;
    public AccountHistorySearchPublicResponse records(AccountHistoryPublicRecord[] records)
    {
        this.records = records;
        return this;
    }
}