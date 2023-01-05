package com.ringcentral.definitions;


public class UpdateUnifiedPresenceTelephony
{
    /**
     * Telephony DND status
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptQueueCalls
     */
    public String availability;
    public UpdateUnifiedPresenceTelephony availability(String availability)
    {
        this.availability = availability;
        return this;
    }
}