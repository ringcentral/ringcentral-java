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
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public NetworksList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public NetworksList records(NetworkInfo[] records) {
        this.records = records;
        return this;
    }

    public NetworksList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public NetworksList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
