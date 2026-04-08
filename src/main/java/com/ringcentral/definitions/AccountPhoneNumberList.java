package com.ringcentral.definitions;

public class AccountPhoneNumberList {
    /** List of account phone numbers Required */
    public AccountPhoneNumberInfo[] records;

    public AccountPhoneNumberList records(AccountPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public AccountPhoneNumberList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
