package com.ringcentral.definitions;


/**
 * Returned if *BLF* feature is switched on
 */
public class UnifiedPresenceTelephony {
    /**
     * Telephony status calculated from all user&#039;s phone numbers. Returned always for the requester&#039;s extension; returned for another users if their telephony visibility is set to &#039;Visible&#039;
     * Enum: NoCall, Ringing, CallConnected, OnHold, ParkedCall
     */
    public String status;
    /**
     * Specifies if the user hardphone presence status is visible to other users; returned only for requester&#039;s extension
     * Enum: Visible, Invisible
     */
    public String visibility;
    /**
     * Telephony DND status. Returned if *DND* feature is switched on
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptQueueCalls
     */
    public String availability;

    public UnifiedPresenceTelephony status(String status) {
        this.status = status;
        return this;
    }

    public UnifiedPresenceTelephony visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public UnifiedPresenceTelephony availability(String availability) {
        this.availability = availability;
        return this;
    }
}
