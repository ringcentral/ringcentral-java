package com.ringcentral.definitions;


public class UpdateNetworkRequest {
    /**
     * Internal identifier of a network
     * Example: 2874044
     */
    public String id;
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

    public UpdateNetworkRequest id(String id) {
        this.id = id;
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
}
