package com.ringcentral.definitions;


public class PackageInfo
{
    /**
     * Billing package version
     */
    public String version;
    public PackageInfo version(String version)
    {
        this.version = version;
        return this;
    }

    /**
     * Billing package identifier
     */
    public String id;
    public PackageInfo id(String id)
    {
        this.id = id;
        return this;
    }
}