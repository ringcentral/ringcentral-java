package com.ringcentral.definitions;


public class AccountPhoneNumberList {
    /**
     * List of account phone numbers
     * Required
     */
    public AccountPhoneNumberInfo[] records;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public AccountPhoneNumberList records(AccountPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public AccountPhoneNumberList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
