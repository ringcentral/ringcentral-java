package com.ringcentral.definitions;


public class NetworksList {
    /**
     * Link to a networks resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public NetworkInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public NetworksList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public NetworksList records(NetworkInfo[] records) {
        this.records = records;
        return this;
    }

    public NetworksList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public NetworksList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
