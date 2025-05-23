package com.ringcentral.definitions;


/**
 * RingOut status information
 */
public class RingOutStatusInfo {
    /**
     * Status of a call and calling/called party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser, Error
     */
    public String callStatus;
    /**
     * Status of a call and calling/called party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser, Error
     */
    public String callerStatus;
    /**
     * Status of a call and calling/called party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser, Error
     */
    public String calleeStatus;

    public RingOutStatusInfo callStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }

    public RingOutStatusInfo callerStatus(String callerStatus) {
        this.callerStatus = callerStatus;
        return this;
    }

    public RingOutStatusInfo calleeStatus(String calleeStatus) {
        this.calleeStatus = calleeStatus;
        return this;
    }
}
