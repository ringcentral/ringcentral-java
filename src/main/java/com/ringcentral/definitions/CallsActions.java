package com.ringcentral.definitions;


public class CallsActions {
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

    public CallsActions parksOn(Double parksOn) {
        this.parksOn = parksOn;
        return this;
    }

    public CallsActions parksOff(Double parksOff) {
        this.parksOff = parksOff;
        return this;
    }

    public CallsActions holdsOn(Double holdsOn) {
        this.holdsOn = holdsOn;
        return this;
    }

    public CallsActions holdsOff(Double holdsOff) {
        this.holdsOff = holdsOff;
        return this;
    }

    public CallsActions blindTransfer(Double blindTransfer) {
        this.blindTransfer = blindTransfer;
        return this;
    }

    public CallsActions warmTransfer(Double warmTransfer) {
        this.warmTransfer = warmTransfer;
        return this;
    }

    public CallsActions dtmfTransfer(Double dtmfTransfer) {
        this.dtmfTransfer = dtmfTransfer;
        return this;
    }
}
