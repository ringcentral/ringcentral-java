package com.ringcentral.definitions;


public class GetCountryListResponse {
    /**
     * Link to the list of countries supported
     */
    public String uri;
    /**
     * List of countries with the country data
     * Required
     */
    public GetCountryInfoDictionaryResponse[] records;
    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetCountryListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

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
