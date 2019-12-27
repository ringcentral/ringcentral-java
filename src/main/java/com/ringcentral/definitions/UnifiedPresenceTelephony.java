package com.ringcentral.definitions;


// Returned if *BLF* feature is switched on
public class UnifiedPresenceTelephony {
    /**
     * Telephony status calculated from all user's phone numbers. Returned always for the requester's extension; returned for another users if their telephony visibility is set to 'Visible'
     * Enum: NoCall, Ringing, CallConnected, OnHold, ParkedCall
     */
    public String status;
    /**
     * Specifies if the user hardphone presence status is visible to other users; returned only for requester's extension
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
