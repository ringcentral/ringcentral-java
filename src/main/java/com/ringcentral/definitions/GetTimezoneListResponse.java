package com.ringcentral.definitions;


public class GetTimezoneListResponse {
    /**
     * List of timezones
     * Required
     */
    public GetTimezoneInfoResponse[] records;
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
