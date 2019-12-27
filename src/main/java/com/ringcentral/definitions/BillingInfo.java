package com.ringcentral.definitions;


public class BillingInfo {
    /**
     * Cost per minute, paid and already included in your RingCentral Plan. For example International Calls
     */
    public Long costIncluded;
    /**
     * Cost per minute, paid and not included in your RingCentral Plan
     */
    public Long costPurchased;

    public BillingInfo costIncluded(Long costIncluded) {
        this.costIncluded = costIncluded;
        return this;
    }

    public BillingInfo costPurchased(Long costPurchased) {
        this.costPurchased = costPurchased;
        return this;
    }

}
