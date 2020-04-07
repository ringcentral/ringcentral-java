package com.ringcentral.definitions;


public class SwitchesList {
    /**
     * Link to the switches list resource
     */
    public String uri;
    /**
     * Switches map
     */
    public SwitchInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public SwitchesList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SwitchesList records(SwitchInfo[] records) {
        this.records = records;
        return this;
    }

    public SwitchesList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public SwitchesList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
