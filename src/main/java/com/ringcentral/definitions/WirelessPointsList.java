package com.ringcentral.definitions;


public class WirelessPointsList {
    /**
     * Link to a wireless points resource
     * Format: uri
     */
    public String uri;
    /**
     * List of wireless points with assigned emergency addresses
     */
    public WirelessPointInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public WirelessPointsList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public WirelessPointsList records(WirelessPointInfo[] records) {
        this.records = records;
        return this;
    }

    public WirelessPointsList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public WirelessPointsList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
