package com.ringcentral.definitions;


public class BillingPackageInfo {
    /**
     * Billing package version
     */
    public String version;
    /**
     * Billing package identifier
     */
    public String id;

    public BillingPackageInfo version(String version) {
        this.version = version;
        return this;
    }

    public BillingPackageInfo id(String id) {
        this.id = id;
        return this;
    }
}
