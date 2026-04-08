package com.ringcentral.definitions;


public class EmergencyLocationsResource
{
    /**
     * Link to an emergency locations resource
     */
    public String uri;
    public EmergencyLocationsResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public CommonEmergencyLocationResource[] records;
    public EmergencyLocationsResource records(CommonEmergencyLocationResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public EmergencyLocationsPaging paging;
    public EmergencyLocationsResource paging(EmergencyLocationsPaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public EmergencyLocationsResource navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }
}