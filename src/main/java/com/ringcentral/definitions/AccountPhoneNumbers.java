package com.ringcentral.definitions;


public class AccountPhoneNumbers {
    /**
     * Link to a list of account phone numbers
     * Format: uri
     */
    public String uri;
    /**
     * List of account phone numbers
     */
    public CompanyPhoneNumberInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public AccountPhoneNumbers uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountPhoneNumbers records(CompanyPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public AccountPhoneNumbers navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public AccountPhoneNumbers paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
