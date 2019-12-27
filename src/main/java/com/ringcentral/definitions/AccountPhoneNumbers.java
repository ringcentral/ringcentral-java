package com.ringcentral.definitions;


public class AccountPhoneNumbers {
    /**
     * Link to the list of account phone numbers
     */
    public String uri;
    /**
     * List of account phone numbers
     */
    public CompanyPhoneNumberInfo[] records;
    /**
     * Information on navigation
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     */
    public ProvisioningPagingInfo paging;

    public AccountPhoneNumbers uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountPhoneNumbers records(CompanyPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public AccountPhoneNumbers navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public AccountPhoneNumbers paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
