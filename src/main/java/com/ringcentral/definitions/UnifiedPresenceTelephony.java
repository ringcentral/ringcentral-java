package com.ringcentral.definitions;


    /**
* Returned if *BLF* feature is switched on
*/
public class UnifiedPresenceTelephony
{
    /**
     * Telephony status calculated from all user&#039;s phone numbers. Returned always for the requester&#039;s extension; returned for another users if their telephony visibility is set to &#039;Visible&#039;
     * Enum: NoCall, Ringing, CallConnected, OnHold, ParkedCall
     */
    public String status;
    public UnifiedPresenceTelephony status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Specifies if the user&#039;s phone presence status is visible to other users; returned only for requester&#039;s extension
     * Enum: Visible, Invisible
     */
    public String visibility;
    public UnifiedPresenceTelephony visibility(String visibility)
    {
        this.visibility = visibility;
        return this;
    }

    /**
     * Telephony DND status. Returned if *DND* feature is switched on
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptQueueCalls
     */
    public String availability;
    public UnifiedPresenceTelephony availability(String availability)
    {
        this.availability = availability;
        return this;
    }
}