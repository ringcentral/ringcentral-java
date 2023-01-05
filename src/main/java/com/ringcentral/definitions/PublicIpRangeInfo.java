package com.ringcentral.definitions;


public class PublicIpRangeInfo
{
    /**
     */
    public String id;
    public PublicIpRangeInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String startIp;
    public PublicIpRangeInfo startIp(String startIp)
    {
        this.startIp = startIp;
        return this;
    }

    /**
     */
    public String endIp;
    public PublicIpRangeInfo endIp(String endIp)
    {
        this.endIp = endIp;
        return this;
    }

    /**
     */
    public Boolean matched;
    public PublicIpRangeInfo matched(Boolean matched)
    {
        this.matched = matched;
        return this;
    }
}