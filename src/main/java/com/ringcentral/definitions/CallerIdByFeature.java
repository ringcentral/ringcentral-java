package com.ringcentral.definitions;


/**
 * Caller ID settings by feature
 */
public class CallerIdByFeature {
    /**
     * Enum: RingOut, RingMe, CallFlip, FaxNumber, AdditionalSoftphone, Alternate, CommonPhone, MobileApp, Delegated
     */
    public String feature;
    /**
     *
     */
    public CallerIdByFeatureInfo callerId;

    public CallerIdByFeature feature(String feature) {
        this.feature = feature;
        return this;
    }

    public CallerIdByFeature callerId(CallerIdByFeatureInfo callerId) {
        this.callerId = callerId;
        return this;
    }
}
