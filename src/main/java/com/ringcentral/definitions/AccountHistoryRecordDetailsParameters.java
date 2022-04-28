package com.ringcentral.definitions;


public class AccountHistoryRecordDetailsParameters {
    /**
     * Required
     * Example: settingName
     */
    public String key;
    /**
     * Required
     * Example: Password
     */
    public String value;

    public AccountHistoryRecordDetailsParameters key(String key) {
        this.key = key;
        return this;
    }

    public AccountHistoryRecordDetailsParameters value(String value) {
        this.value = value;
        return this;
    }
}
