package com.ringcentral.definitions;


public class GetCountryListResponse {
    /**
     * List of countries with the country data
     * Required
     */
    public GetCountryInfoDictionaryResponse[] records;
    /**
     * Information on navigation
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetCountryListResponse records(GetCountryInfoDictionaryResponse[] records) {
        this.records = records;
        return this;
    }

    public GetCountryListResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetCountryListResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
