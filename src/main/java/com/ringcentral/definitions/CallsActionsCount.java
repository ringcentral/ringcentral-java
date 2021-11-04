package com.ringcentral.definitions;


// Calls actions count
public class CallsActionsCount {
    /**
     * Required
     * Format: int64
     */
    public Long parksOn;
    /**
     * Required
     * Format: int64
     */
    public Long parksOff;
    /**
     * Required
     * Format: int64
     */
    public Long holdsOn;
    /**
     * Required
     * Format: int64
     */
    public Long holdsOff;
    /**
     * Required
     * Format: int64
     */
    public Long blindTransfer;
    /**
     * Required
     * Format: int64
     */
    public Long warmTransfer;

    public CallsActionsCount parksOn(Long parksOn) {
        this.parksOn = parksOn;
        return this;
    }

    public CallsActionsCount parksOff(Long parksOff) {
        this.parksOff = parksOff;
        return this;
    }

    public CallsActionsCount holdsOn(Long holdsOn) {
        this.holdsOn = holdsOn;
        return this;
    }

    public CallsActionsCount holdsOff(Long holdsOff) {
        this.holdsOff = holdsOff;
        return this;
    }

    public CallsActionsCount blindTransfer(Long blindTransfer) {
        this.blindTransfer = blindTransfer;
        return this;
    }

    public CallsActionsCount warmTransfer(Long warmTransfer) {
        this.warmTransfer = warmTransfer;
        return this;
    }
}
