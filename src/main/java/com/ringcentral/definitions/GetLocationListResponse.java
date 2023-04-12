package com.ringcentral.definitions;


public class GetLocationListResponse {
    /**
     * Link to the location list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of locations
     */
    public LocationInfo[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public GetLocationListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetLocationListResponse records(LocationInfo[] records) {
        this.records = records;
        return this;
    }

    public GetLocationListResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetLocationListResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
