package com.ringcentral.definitions;

public class WirelessPointsList {
    /** Link to a wireless points resource Format: uri */
    public String uri;

    public WirelessPointsList uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of wireless points with assigned emergency addresses */
    public WirelessPointInfo[] records;

    public WirelessPointsList records(WirelessPointInfo[] records) {
        this.records = records;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public WirelessPointsList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public WirelessPointsList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
