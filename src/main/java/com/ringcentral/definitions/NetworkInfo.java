package com.ringcentral.definitions;


public class NetworkInfo {
    /**
     * Internal identifier of a network
     */
    public String id;
    /**
     * Link to a network resource
     * Format: uri
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
    public PrivateIpRangeInfo[] privateIpRanges;
    /**
     *
     */
    public ERLLocationInfo emergencyLocation;

    public NetworkInfo id(String id) {
        this.id = id;
        return this;
    }

    public NetworkInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public NetworkInfo name(String name) {
        this.name = name;
        return this;
    }

    public NetworkInfo site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public NetworkInfo publicIpRanges(PublicIpRangeInfo[] publicIpRanges) {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    public NetworkInfo privateIpRanges(PrivateIpRangeInfo[] privateIpRanges) {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

    public NetworkInfo emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}
