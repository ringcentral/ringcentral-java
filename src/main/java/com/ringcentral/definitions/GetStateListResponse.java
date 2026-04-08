package com.ringcentral.definitions;

public class GetStateListResponse {
    /** Link to a states list resource Format: uri */
    public String uri;

    public GetStateListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of states */
    public GetStateInfoResponse[] records;

    public GetStateListResponse records(GetStateInfoResponse[] records) {
        this.records = records;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public GetStateListResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public GetStateListResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
