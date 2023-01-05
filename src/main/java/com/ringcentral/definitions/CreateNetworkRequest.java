package com.ringcentral.definitions;


public class CreateNetworkRequest
{
    /**
     * Required
     */
    public String name;
    public CreateNetworkRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public AutomaticLocationUpdatesSiteInfo site;
    public CreateNetworkRequest site(AutomaticLocationUpdatesSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Required
     */
    public PublicIpRangeInfo[] publicIpRanges;
    public CreateNetworkRequest publicIpRanges(PublicIpRangeInfo[] publicIpRanges)
    {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    /**
     * Required
     */
    public PrivateIpRangeInfoRequest[] privateIpRanges;
    public CreateNetworkRequest privateIpRanges(PrivateIpRangeInfoRequest[] privateIpRanges)
    {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    /**
     */
    public ERLLocationInfo emergencyLocation;
    public CreateNetworkRequest emergencyLocation(ERLLocationInfo emergencyLocation)
    {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}