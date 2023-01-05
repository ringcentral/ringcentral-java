package com.ringcentral.definitions;


public class UpdateNetworkRequest
{
    /**
     * Internal identifier of a network
     * Example: 2874044
     */
    public String id;
    public UpdateNetworkRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Required
     */
    public String name;
    public UpdateNetworkRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public AutomaticLocationUpdatesSiteInfo site;
    public UpdateNetworkRequest site(AutomaticLocationUpdatesSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Required
     */
    public PublicIpRangeInfo[] publicIpRanges;
    public UpdateNetworkRequest publicIpRanges(PublicIpRangeInfo[] publicIpRanges)
    {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    /**
     * Required
     */
    public PrivateIpRangeInfoRequest[] privateIpRanges;
    public UpdateNetworkRequest privateIpRanges(PrivateIpRangeInfoRequest[] privateIpRanges)
    {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    /**
     */
    public ERLLocationInfo emergencyLocation;
    public UpdateNetworkRequest emergencyLocation(ERLLocationInfo emergencyLocation)
    {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}