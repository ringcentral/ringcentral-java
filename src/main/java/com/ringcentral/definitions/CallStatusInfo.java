package com.ringcentral.definitions;


public class CallStatusInfo {
    /**
     * Status code of a call
     * Enum: Setup, Proceeding, Answered, Disconnected, Gone, Parked, Hold, VoiceMail, FaxReceive, Tds, VoiceMailScreening
     */
    public String code;
    /**
     * Peer session / party data. Valid in Gone state only
     */
    public PeerInfo peerId;
    /**
     * Reason of call termination. For 'Disconnected' code only
     * Enum: Pickup, Supervising, TakeOver, Timeout, BlindTransfer, RccTransfer, AttendedTransfer, CallerInputRedirect, CallFlip, ParkLocation, DtmfTransfer, AgentAnswered, AgentDropped, Rejected, Cancelled, InternalError, NoAnswer, TargetBusy, InvalidNumber, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser, CallRedirected
     */
    public String reason;
    /**
     * Optional message
     */
    public String description;

    public CallStatusInfo code(String code) {
        this.code = code;
        return this;
    }

    public CallStatusInfo peerId(PeerInfo peerId) {
        this.peerId = peerId;
        return this;
    }

    public CallStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public CallStatusInfo description(String description) {
        this.description = description;
        return this;
    }

}
