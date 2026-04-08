package com.ringcentral.definitions;

public class BillingPackageInfo {
    /** Billing package version */
    public String version;

    public BillingPackageInfo version(String version) {
        this.version = version;
        return this;
    }

    /** Billing package identifier */
    public String id;

    public BillingPackageInfo id(String id) {
        this.id = id;
        return this;
    }
}
