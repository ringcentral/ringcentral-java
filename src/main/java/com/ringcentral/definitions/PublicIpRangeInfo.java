package com.ringcentral.definitions;


public class PublicIpRangeInfo {
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
     *
     */
    public Boolean matched;

    public PublicIpRangeInfo id(String id) {
        this.id = id;
        return this;
    }

    public PublicIpRangeInfo startIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    public PublicIpRangeInfo endIp(String endIp) {
        this.endIp = endIp;
        return this;
    }

    public PublicIpRangeInfo matched(Boolean matched) {
        this.matched = matched;
        return this;
    }
}
