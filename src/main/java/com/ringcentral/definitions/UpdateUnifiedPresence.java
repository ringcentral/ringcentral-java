package com.ringcentral.definitions;


public class UpdateUnifiedPresence {
    /**
     *
     */
    public UpdateUnifiedPresenceGlip glip;
    /**
     *
     */
    public UpdateUnifiedPresenceTelephony telephony;

    public UpdateUnifiedPresence glip(UpdateUnifiedPresenceGlip glip) {
        this.glip = glip;
        return this;
    }

    public UpdateUnifiedPresence telephony(UpdateUnifiedPresenceTelephony telephony) {
        this.telephony = telephony;
        return this;
    }
}
