package com.ringcentral.definitions;


public class PackageInfo {
    /**
     *
     */
    public String version;
    /**
     *
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
