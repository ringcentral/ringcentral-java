package com.ringcentral.definitions;


public class AnalyticsLegacyCallsActions {
    /**
     * Required
     * Format: double
     */
    public Double parksOn;
    /**
     * Required
     * Format: double
     */
    public Double parksOff;
    /**
     * Required
     * Format: double
     */
    public Double holdsOn;
    /**
     * Required
     * Format: double
     */
    public Double holdsOff;
    /**
     * Required
     * Format: double
     */
    public Double blindTransfer;
    /**
     * Required
     * Format: double
     */
    public Double warmTransfer;
    /**
     * Required
     * Format: double
     */
    public Double dtmfTransfer;

    public AnalyticsLegacyCallsActions parksOn(Double parksOn) {
        this.parksOn = parksOn;
        return this;
    }

    public AnalyticsLegacyCallsActions parksOff(Double parksOff) {
        this.parksOff = parksOff;
        return this;
    }

    public AnalyticsLegacyCallsActions holdsOn(Double holdsOn) {
        this.holdsOn = holdsOn;
        return this;
    }

    public AnalyticsLegacyCallsActions holdsOff(Double holdsOff) {
        this.holdsOff = holdsOff;
        return this;
    }

    public AnalyticsLegacyCallsActions blindTransfer(Double blindTransfer) {
        this.blindTransfer = blindTransfer;
        return this;
    }

    public AnalyticsLegacyCallsActions warmTransfer(Double warmTransfer) {
        this.warmTransfer = warmTransfer;
        return this;
    }

    public AnalyticsLegacyCallsActions dtmfTransfer(Double dtmfTransfer) {
        this.dtmfTransfer = dtmfTransfer;
        return this;
    }
}
