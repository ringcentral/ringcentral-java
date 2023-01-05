package com.ringcentral.definitions;


public class SubscriptionInfoBlacklistedData
{
    /**
     * Time of adding subscription to a black list in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String blacklistedAt;
    public SubscriptionInfoBlacklistedData blacklistedAt(String blacklistedAt)
    {
        this.blacklistedAt = blacklistedAt;
        return this;
    }

    /**
     * Reason of adding subscription to a black list
     */
    public String reason;
    public SubscriptionInfoBlacklistedData reason(String reason)
    {
        this.reason = reason;
        return this;
    }
}