package com.ringcentral.definitions;

public class GetLocationListResponse {
    /** Link to the location list resource Format: uri */
    public String uri;

    public GetLocationListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of locations */
    public LocationInfo[] records;

    public GetLocationListResponse records(LocationInfo[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public PageNavigationModel navigation;

    public GetLocationListResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public GetLocationListResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
