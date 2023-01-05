package com.ringcentral.definitions;


public class GetExtensionPhoneNumbersResponse
{
    /**
     * Link to the user phone number list resource
     * Format: uri
     */
    public String uri;
    public GetExtensionPhoneNumbersResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of phone numbers
     * Required
     */
    public UserPhoneNumberInfo[] records;
    public GetExtensionPhoneNumbersResponse records(UserPhoneNumberInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    public GetExtensionPhoneNumbersResponse navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningPagingInfo paging;
    public GetExtensionPhoneNumbersResponse paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}