package com.ringcentral.definitions;


public class CreateNetworkRequest {
    /**
     * Required
     */
    public String name;
    /**
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     * Required
     */
    public PublicIpRangeInfo[] publicIpRanges;
    /**
     * Required
     */
    public PrivateIpRangeInfoRequest[] privateIpRanges;
    /**
     *
     */
    public ERLLocationInfo emergencyLocation;

    public CreateNetworkRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateNetworkRequest site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public CreateNetworkRequest publicIpRanges(PublicIpRangeInfo[] publicIpRanges) {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    public CreateNetworkRequest privateIpRanges(PrivateIpRangeInfoRequest[] privateIpRanges) {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    public CreateNetworkRequest emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}
