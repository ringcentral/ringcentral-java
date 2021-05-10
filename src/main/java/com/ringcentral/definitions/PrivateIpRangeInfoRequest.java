package com.ringcentral.definitions;


public class PrivateIpRangeInfoRequest {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String startIp;
    /**
     *
     */
    public String endIp;
    /**
     * Network name
     */
    public String name;
    /**
     *
     */
    public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
    /**
     * Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;

    public PrivateIpRangeInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public PrivateIpRangeInfoRequest startIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    public PrivateIpRangeInfoRequest endIp(String endIp) {
        this.endIp = endIp;
        return this;
    }

    public PrivateIpRangeInfoRequest name(String name) {
        this.name = name;
        return this;
    }

    public PrivateIpRangeInfoRequest emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public PrivateIpRangeInfoRequest emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }
}
