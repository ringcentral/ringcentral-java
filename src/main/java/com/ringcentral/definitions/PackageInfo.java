package com.ringcentral.definitions;


public class PackageInfo {
    /**
     * Billing package version
     */
    public String version;
    /**
     * Billing package identifier
     */
    public String id;

    public PackageInfo version(String version) {
        this.version = version;
        return this;
    }

    public PackageInfo id(String id) {
        this.id = id;
        return this;
    }
}
