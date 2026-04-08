package com.ringcentral.definitions;


    /**
* Billing information related to the call. Returned for 'Detailed' view only
*/
public class BillingInfo
{
    /**
     * Cost per minute, paid and already included in your RingCentral service plan.
    * For example International Calls
     * Format: double
     */
    public Double costIncluded;
    public BillingInfo costIncluded(Double costIncluded)
    {
        this.costIncluded = costIncluded;
        return this;
    }

    /**
     * Cost per minute, paid and not included in your RingCentral service plan
     * Format: double
     */
    public Double costPurchased;
    public BillingInfo costPurchased(Double costPurchased)
    {
        this.costPurchased = costPurchased;
        return this;
    }
}