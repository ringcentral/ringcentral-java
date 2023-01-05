package com.ringcentral.definitions;


    /**
* Caller ID settings by feature
*/
public class CallerIdByFeatureRequest
{
    /**
     * Enum: RingOut, RingMe, CallFlip, FaxNumber, AdditionalSoftphone, Alternate, CommonPhone, MobileApp, Delegated
     */
    public String feature;
    public CallerIdByFeatureRequest feature(String feature)
    {
        this.feature = feature;
        return this;
    }

    /**
     */
    public CallerIdByFeatureInfoRequest callerId;
    public CallerIdByFeatureRequest callerId(CallerIdByFeatureInfoRequest callerId)
    {
        this.callerId = callerId;
        return this;
    }
}