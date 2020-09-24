package com.ringcentral.definitions;


public class GlipUnreadMessageCountEvent {
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Apple notification data
     */
    public GlipAPNSInfo pn_apns;
    /**
     * GCM data
     */
    public GCMInfo pn_gcm;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public GlipUnreadMessageCountEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public GlipUnreadMessageCountEvent pn_apns(GlipAPNSInfo pn_apns) {
        this.pn_apns = pn_apns;
        return this;
    }

    public GlipUnreadMessageCountEvent pn_gcm(GCMInfo pn_gcm) {
        this.pn_gcm = pn_gcm;
        return this;
    }

    public GlipUnreadMessageCountEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
