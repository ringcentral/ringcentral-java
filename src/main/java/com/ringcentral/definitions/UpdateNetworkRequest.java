package com.ringcentral.definitions;


public class UpdateNetworkRequest {
    /**
     * Internal identifier of a network
     * Example: 2874044
     */
    public String id;
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     *
     */
    public PublicIpRangeInfo[] publicIpRanges;
    /**
     *
     */
    public PrivateIpRangeInfoRequest[] privateIpRanges;
    /**
     *
     */
    public ERLLocationInfo emergencyLocation;

    public UpdateNetworkRequest id(String id) {
        this.id = id;
        return this;
    }

    public UpdateNetworkRequest uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UpdateNetworkRequest name(String name) {
        this.name = name;
        return this;
    }

    public UpdateNetworkRequest site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public UpdateNetworkRequest publicIpRanges(PublicIpRangeInfo[] publicIpRanges) {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    public UpdateNetworkRequest privateIpRanges(PrivateIpRangeInfoRequest[] privateIpRanges) {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    public UpdateNetworkRequest emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}
