package com.ringcentral.definitions;


public class PrivateIpRangeInfoRequest
{
    /**
     */
    public String id;
    public PrivateIpRangeInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String startIp;
    public PrivateIpRangeInfoRequest startIp(String startIp)
    {
        this.startIp = startIp;
        return this;
    }

    /**
     */
    public String endIp;
    public PrivateIpRangeInfoRequest endIp(String endIp)
    {
        this.endIp = endIp;
        return this;
    }

    /**
     * Network name
     */
    public String name;
    public PrivateIpRangeInfoRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
    public PrivateIpRangeInfoRequest emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /**
     * Emergency response location (address) internal identifier.
    * Only one of a pair `emergencyAddress` or `emergencyLocationId` should
    * be specified, otherwise the error is returned
     */
    public String emergencyLocationId;
    public PrivateIpRangeInfoRequest emergencyLocationId(String emergencyLocationId)
    {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }
}