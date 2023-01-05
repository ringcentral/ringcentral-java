package com.ringcentral.definitions;


public class NetworkInfo
{
    /**
     * Internal identifier of a network
     */
    public String id;
    public NetworkInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to a network resource
     * Format: uri
     */
    public String uri;
    public NetworkInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String name;
    public NetworkInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public AutomaticLocationUpdatesSiteInfo site;
    public NetworkInfo site(AutomaticLocationUpdatesSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public PublicIpRangeInfo[] publicIpRanges;
    public NetworkInfo publicIpRanges(PublicIpRangeInfo[] publicIpRanges)
    {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    /**
     */
    public PrivateIpRangeInfo[] privateIpRanges;
    public NetworkInfo privateIpRanges(PrivateIpRangeInfo[] privateIpRanges)
    {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    /**
     */
    public ERLLocationInfo emergencyLocation;
    public NetworkInfo emergencyLocation(ERLLocationInfo emergencyLocation)
    {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}