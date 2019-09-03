package com.ringcentral.definitions;


public class NetworkInfo {
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

}
