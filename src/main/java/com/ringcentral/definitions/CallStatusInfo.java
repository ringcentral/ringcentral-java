package com.ringcentral.definitions;


/**
 * Status data of a call session
 */
public class CallStatusInfo {
    /**
     * Status code of a call
     * Enum: Setup, Proceeding, Answered, Disconnected, Gone, Parked, Hold, VoiceMail, FaxReceive, Tds, VoiceMailScreening
     */
    public String code;
    /**
     * Reason for a call status, might be specified for some codes
     * Enum: Pickup, Supervising, TakeOver, Timeout, BlindTransfer, RccTransfer, AttendedTransfer, CallerInputRedirect, CallFlip, ParkLocation, DtmfTransfer, AgentAnswered, AgentDropped, Rejected, Cancelled, InternalError, NoAnswer, TargetBusy, InvalidNumber, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser, CallPark, CallRedirected, CallReplied, CallSwitch, CallFinished, CallDropped, Voicemail
     */
    public String reason;
    /**
     * Optional message
     */
    public String description;
    /**
     * Call park data. Returned for calls in &#039;Parked&#039; state
     */
    public String parkData;
    /**
     *
     */
    public PeerInfo peerId;
    /**
     *
     */
    public MobilePickupData mobilePickupData;
    /**
     * Specifies if it&#039;s a conference call
     */
    public Boolean rcc;

    public CallStatusInfo code(String code) {
        this.code = code;
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

    public CallStatusInfo parkData(String parkData) {
        this.parkData = parkData;
        return this;
    }

    public CallStatusInfo peerId(PeerInfo peerId) {
        this.peerId = peerId;
        return this;
    }

    public CallStatusInfo mobilePickupData(MobilePickupData mobilePickupData) {
        this.mobilePickupData = mobilePickupData;
        return this;
    }

    public CallStatusInfo rcc(Boolean rcc) {
        this.rcc = rcc;
        return this;
    }
}
