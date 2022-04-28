package com.ringcentral.definitions;


public class AccountHistoryRecordPublicDetails {
    /**
     * Event details (additional parameters)
     */
    public AccountHistoryRecordDetailsParameters[] parameters;

    public AccountHistoryRecordPublicDetails parameters(AccountHistoryRecordDetailsParameters[] parameters) {
        this.parameters = parameters;
        return this;
    }
}
