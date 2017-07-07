package com.ringcentral.definitions;

public class BillingInfo {
    // Cost per minute used included in your RingCentral Plan
    public Double costIncluded;
    // Cost per minute used not included in your RingCentral Plan. for example International Calls
    public Double costPurchased;

    public BillingInfo costIncluded(Double costIncluded) {
        this.costIncluded = costIncluded;
        return this;
    }

    public BillingInfo costPurchased(Double costPurchased) {
        this.costPurchased = costPurchased;
        return this;
    }
}
