package com.ringcentral.definitions;


public class PrivateIpRangeInfo {
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
     * Emergency address information (or information assigned to the switch or
     * wireless point - in case of using them). Only one of a pair `emergencyAddress`
     * or `emergencyLocationId` should be specified, otherwise an error is returned
     */
    public PrivateIpRangeInfoEmergencyAddress emergencyAddress;
    /**
     * Emergency response location (address) internal identifier.
     * Only one of a pair `emergencyAddress` or `emergencyLocationId` should
     * be specified, otherwise an error is returned
     */
    public String emergencyLocationId;
    /**
     *
     */
    public Boolean matched;

    public PrivateIpRangeInfo id(String id) {
        this.id = id;
        return this;
    }

    public PrivateIpRangeInfo startIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    public PrivateIpRangeInfo endIp(String endIp) {
        this.endIp = endIp;
        return this;
    }

    public PrivateIpRangeInfo name(String name) {
        this.name = name;
        return this;
    }

    public PrivateIpRangeInfo emergencyAddress(PrivateIpRangeInfoEmergencyAddress emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public PrivateIpRangeInfo emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

    public PrivateIpRangeInfo matched(Boolean matched) {
        this.matched = matched;
        return this;
    }
}
