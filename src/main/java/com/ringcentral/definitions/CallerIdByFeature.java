package com.ringcentral.definitions;

/** Caller ID settings by feature */
public class CallerIdByFeature {
    /**
     * Enum: RingOut, RingMe, CallFlip, FaxNumber, AdditionalSoftphone, Alternate, CommonPhone,
     * MobileApp, Delegated, BusinessMobile
     */
    public String feature;

    public CallerIdByFeature feature(String feature) {
        this.feature = feature;
        return this;
    }

    /** */
    public CallerIdData callerId;

    public CallerIdByFeature callerId(CallerIdData callerId) {
        this.callerId = callerId;
        return this;
    }
}
