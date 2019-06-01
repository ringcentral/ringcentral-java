package com.ringcentral.definitions;


public class AccountPhoneNumbers {
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
