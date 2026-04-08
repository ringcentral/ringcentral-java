package com.ringcentral.definitions;


public class AccountHistoryRecordDetailsParameters
{
    /**
     * Required
     * Example: settingName
     */
    public String key;
    public AccountHistoryRecordDetailsParameters key(String key)
    {
        this.key = key;
        return this;
    }

    /**
     * Required
     * Example: Password
     */
    public String value;
    public AccountHistoryRecordDetailsParameters value(String value)
    {
        this.value = value;
        return this;
    }
}