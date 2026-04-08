package com.ringcentral.definitions;

/** RingOut status information */
public class RingOutStatusInfo {
    /**
     * Status of a call and calling/called party Enum: Invalid, Success, InProgress, Busy, NoAnswer,
     * RingOutFromThisNumberIsNotSupported, Rejected, GenericError, Finished, InternationalDisabled,
     * DestinationBlocked, NotEnoughFunds, NoSuchUser, Error
     */
    public String callStatus;

    public RingOutStatusInfo callStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }

    /**
     * Status of a call and calling/called party Enum: Invalid, Success, InProgress, Busy, NoAnswer,
     * RingOutFromThisNumberIsNotSupported, Rejected, GenericError, Finished, InternationalDisabled,
     * DestinationBlocked, NotEnoughFunds, NoSuchUser, Error
     */
    public String callerStatus;

    public RingOutStatusInfo callerStatus(String callerStatus) {
        this.callerStatus = callerStatus;
        return this;
    }

    /**
     * Status of a call and calling/called party Enum: Invalid, Success, InProgress, Busy, NoAnswer,
     * RingOutFromThisNumberIsNotSupported, Rejected, GenericError, Finished, InternationalDisabled,
     * DestinationBlocked, NotEnoughFunds, NoSuchUser, Error
     */
    public String calleeStatus;

    public RingOutStatusInfo calleeStatus(String calleeStatus) {
        this.calleeStatus = calleeStatus;
        return this;
    }
}
