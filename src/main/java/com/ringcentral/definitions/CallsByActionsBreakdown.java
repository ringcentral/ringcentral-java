package com.ringcentral.definitions;


    /**
* Result breakdown by actions
*/
public class CallsByActionsBreakdown
{
    /**
     * Value for ParkOn action
     * Required
     * Format: double
     */
    public Double parkOn;
    public CallsByActionsBreakdown parkOn(Double parkOn)
    {
        this.parkOn = parkOn;
        return this;
    }

    /**
     * Value for ParkOff action
     * Required
     * Format: double
     */
    public Double parkOff;
    public CallsByActionsBreakdown parkOff(Double parkOff)
    {
        this.parkOff = parkOff;
        return this;
    }

    /**
     * Value for HoldOn action
     * Required
     * Format: double
     */
    public Double holdOn;
    public CallsByActionsBreakdown holdOn(Double holdOn)
    {
        this.holdOn = holdOn;
        return this;
    }

    /**
     * Value for HoldOff action
     * Required
     * Format: double
     */
    public Double holdOff;
    public CallsByActionsBreakdown holdOff(Double holdOff)
    {
        this.holdOff = holdOff;
        return this;
    }

    /**
     * Value for BlindTransfer action
     * Required
     * Format: double
     */
    public Double blindTransfer;
    public CallsByActionsBreakdown blindTransfer(Double blindTransfer)
    {
        this.blindTransfer = blindTransfer;
        return this;
    }

    /**
     * Value for WarmTransfer action
     * Required
     * Format: double
     */
    public Double warmTransfer;
    public CallsByActionsBreakdown warmTransfer(Double warmTransfer)
    {
        this.warmTransfer = warmTransfer;
        return this;
    }

    /**
     * Value for DTMFTransfer action
     * Required
     * Format: double
     */
    public Double dtmfTransfer;
    public CallsByActionsBreakdown dtmfTransfer(Double dtmfTransfer)
    {
        this.dtmfTransfer = dtmfTransfer;
        return this;
    }
}