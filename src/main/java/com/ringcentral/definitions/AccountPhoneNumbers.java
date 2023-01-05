package com.ringcentral.definitions;


public class AccountPhoneNumbers
{
    /**
     * Link to a list of account phone numbers
     * Format: uri
     */
    public String uri;
    public AccountPhoneNumbers uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of account phone numbers
     */
    public CompanyPhoneNumberInfo[] records;
    public AccountPhoneNumbers records(CompanyPhoneNumberInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfo navigation;
    public AccountPhoneNumbers navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public ProvisioningPagingInfo paging;
    public AccountPhoneNumbers paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}