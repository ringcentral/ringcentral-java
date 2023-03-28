package com.ringcentral.definitions;


public class GetTimezoneListResponse {
    /**
     * Link to the timezone list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of timezones
     * Required
     */
    public GetTimezoneInfoResponse[] records;
    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetTimezoneListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetTimezoneListResponse records(GetTimezoneInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetTimezoneListResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetTimezoneListResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
