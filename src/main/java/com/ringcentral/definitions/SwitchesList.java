package com.ringcentral.definitions;


public class SwitchesList
{
    /**
     * Switches map
     */
    public SwitchInfo[] records;
    public SwitchesList records(SwitchInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfo navigation;
    public SwitchesList navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public ProvisioningPagingInfo paging;
    public SwitchesList paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}