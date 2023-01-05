package com.ringcentral.definitions;


    /**
* RingOut status information
*/
public class RingOutStatusInfo
{
    /**
     * Status of a call
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
     */
    public String callStatus;
    public RingOutStatusInfo callStatus(String callStatus)
    {
        this.callStatus = callStatus;
        return this;
    }

    /**
     * Status of a calling party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
     */
    public String callerStatus;
    public RingOutStatusInfo callerStatus(String callerStatus)
    {
        this.callerStatus = callerStatus;
        return this;
    }

    /**
     * Status of a called party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
     */
    public String calleeStatus;
    public RingOutStatusInfo calleeStatus(String calleeStatus)
    {
        this.calleeStatus = calleeStatus;
        return this;
    }
}