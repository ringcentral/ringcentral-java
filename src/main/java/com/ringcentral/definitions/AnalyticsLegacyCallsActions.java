package com.ringcentral.definitions;


public class AnalyticsLegacyCallsActions
{
    /**
     * Required
     * Format: double
     */
    public Double parksOn;
    public AnalyticsLegacyCallsActions parksOn(Double parksOn)
    {
        this.parksOn = parksOn;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double parksOff;
    public AnalyticsLegacyCallsActions parksOff(Double parksOff)
    {
        this.parksOff = parksOff;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double holdsOn;
    public AnalyticsLegacyCallsActions holdsOn(Double holdsOn)
    {
        this.holdsOn = holdsOn;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double holdsOff;
    public AnalyticsLegacyCallsActions holdsOff(Double holdsOff)
    {
        this.holdsOff = holdsOff;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double blindTransfer;
    public AnalyticsLegacyCallsActions blindTransfer(Double blindTransfer)
    {
        this.blindTransfer = blindTransfer;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double warmTransfer;
    public AnalyticsLegacyCallsActions warmTransfer(Double warmTransfer)
    {
        this.warmTransfer = warmTransfer;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double dtmfTransfer;
    public AnalyticsLegacyCallsActions dtmfTransfer(Double dtmfTransfer)
    {
        this.dtmfTransfer = dtmfTransfer;
        return this;
    }
}