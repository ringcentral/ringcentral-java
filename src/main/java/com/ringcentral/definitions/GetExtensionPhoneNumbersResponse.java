package com.ringcentral.definitions;


public class GetExtensionPhoneNumbersResponse {
    /**
     * Link to the user phone number list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of phone numbers
     * Required
     */
    public UserPhoneNumberInfo[] records;
    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetExtensionPhoneNumbersResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionPhoneNumbersResponse records(UserPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionPhoneNumbersResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionPhoneNumbersResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
