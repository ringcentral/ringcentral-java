package com.ringcentral.definitions;


public class UnifiedPresence {
    /**
     * Aggregated presence status of the user
     * Enum: Available, Offline, DND, Busy
     */
    public String status;
    /**
     *
     */
    public UnifiedPresenceGlip glip;
    /**
     *
     */
    public UnifiedPresenceTelephony telephony;
    /**
     *
     */
    public UnifiedPresenceMeeting meeting;

    public UnifiedPresence status(String status) {
        this.status = status;
        return this;
    }

    public UnifiedPresence glip(UnifiedPresenceGlip glip) {
        this.glip = glip;
        return this;
    }

    public UnifiedPresence telephony(UnifiedPresenceTelephony telephony) {
        this.telephony = telephony;
        return this;
    }

    public UnifiedPresence meeting(UnifiedPresenceMeeting meeting) {
        this.meeting = meeting;
        return this;
    }
}
