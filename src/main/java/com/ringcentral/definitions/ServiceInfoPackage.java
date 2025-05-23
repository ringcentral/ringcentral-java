package com.ringcentral.definitions;


/**
 * Billing package information
 */
public class ServiceInfoPackage {
    /**
     * Billing package ID
     * Required
     * Example: 555
     */
    public String id;
    /**
     * Billing package version
     * Required
     * Example: 1
     */
    public String version;

    public ServiceInfoPackage id(String id) {
        this.id = id;
        return this;
    }

    public ServiceInfoPackage version(String version) {
        this.version = version;
        return this;
    }
}
