package com.ringcentral.definitions;


    /**
* Status data of a call session
*/
public class CallStatusInfo
{
    /**
     * Status code of a call
     * Enum: Setup, Proceeding, Answered, Disconnected, Gone, Parked, Hold, VoiceMail, FaxReceive, Tds, VoiceMailScreening
     */
    public String code;
    public CallStatusInfo code(String code)
    {
        this.code = code;
        return this;
    }

    /**
     */
    public PeerInfo peerId;
    public CallStatusInfo peerId(PeerInfo peerId)
    {
        this.peerId = peerId;
        return this;
    }

    /**
     * Reason for call termination. For &#039;Disconnected&#039; code only
     * Enum: Pickup, Supervising, TakeOver, Timeout, BlindTransfer, RccTransfer, AttendedTransfer, CallerInputRedirect, CallFlip, ParkLocation, DtmfTransfer, AgentAnswered, AgentDropped, Rejected, Cancelled, InternalError, NoAnswer, TargetBusy, InvalidNumber, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser, CallPark, CallRedirected, CallReplied, CallSwitch, CallFinished, CallDropped
     */
    public String reason;
    public CallStatusInfo reason(String reason)
    {
        this.reason = reason;
        return this;
    }

    /**
     * Optional message
     */
    public String description;
    public CallStatusInfo description(String description)
    {
        this.description = description;
        return this;
    }
}