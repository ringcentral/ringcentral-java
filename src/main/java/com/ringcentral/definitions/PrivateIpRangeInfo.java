package com.ringcentral.definitions;


public class PrivateIpRangeInfo
{
    /**
     */
    public String id;
    public PrivateIpRangeInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String startIp;
    public PrivateIpRangeInfo startIp(String startIp)
    {
        this.startIp = startIp;
        return this;
    }

    /**
     */
    public String endIp;
    public PrivateIpRangeInfo endIp(String endIp)
    {
        this.endIp = endIp;
        return this;
    }

    /**
     * Network name
     */
    public String name;
    public PrivateIpRangeInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public LocationUpdatesEmergencyAddressInfo emergencyAddress;
    public PrivateIpRangeInfo emergencyAddress(LocationUpdatesEmergencyAddressInfo emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /**
     * Emergency response location (address) internal identifier.
    * Only one of a pair `emergencyAddress` or `emergencyLocationId` should
    * be specified, otherwise an error is returned
     */
    public String emergencyLocationId;
    public PrivateIpRangeInfo emergencyLocationId(String emergencyLocationId)
    {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

    /**
     */
    public Boolean matched;
    public PrivateIpRangeInfo matched(Boolean matched)
    {
        this.matched = matched;
        return this;
    }
}