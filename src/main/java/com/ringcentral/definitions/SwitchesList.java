package com.ringcentral.definitions;


public class SwitchesList {
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
