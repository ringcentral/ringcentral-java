package com.ringcentral.definitions;


/**
 * Result breakdown by actions
 */
public class CallsByActionsBreakdown {
    /**
     * Value for ParkOn action
     * Required
     * Format: double
     */
    public Double parkOn;
    /**
     * Value for ParkOff action
     * Required
     * Format: double
     */
    public Double parkOff;
    /**
     * Value for HoldOn action
     * Required
     * Format: double
     */
    public Double holdOn;
    /**
     * Value for HoldOff action
     * Required
     * Format: double
     */
    public Double holdOff;
    /**
     * Value for BlindTransfer action
     * Required
     * Format: double
     */
    public Double blindTransfer;
    /**
     * Value for WarmTransfer action
     * Required
     * Format: double
     */
    public Double warmTransfer;
    /**
     * Value for DTMFTransfer action
     * Required
     * Format: double
     */
    public Double dtmfTransfer;

    public CallsByActionsBreakdown parkOn(Double parkOn) {
        this.parkOn = parkOn;
        return this;
    }

    public CallsByActionsBreakdown parkOff(Double parkOff) {
        this.parkOff = parkOff;
        return this;
    }

    public CallsByActionsBreakdown holdOn(Double holdOn) {
        this.holdOn = holdOn;
        return this;
    }

    public CallsByActionsBreakdown holdOff(Double holdOff) {
        this.holdOff = holdOff;
        return this;
    }

    public CallsByActionsBreakdown blindTransfer(Double blindTransfer) {
        this.blindTransfer = blindTransfer;
        return this;
    }

    public CallsByActionsBreakdown warmTransfer(Double warmTransfer) {
        this.warmTransfer = warmTransfer;
        return this;
    }

    public CallsByActionsBreakdown dtmfTransfer(Double dtmfTransfer) {
        this.dtmfTransfer = dtmfTransfer;
        return this;
    }
}
