package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipUnreadMessageCountEvent
{
    // Universally unique identifier of a notification
    public String uuid;
    public GlipUnreadMessageCountEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    // Apple notification data
    public GlipAPNSInfo pn_apns;
    public GlipUnreadMessageCountEvent pn_apns(GlipAPNSInfo pn_apns) {
        this.pn_apns = pn_apns;
        return this;
    }
    // GCM data
    public GCMInfo pn_gcm;
    public GlipUnreadMessageCountEvent pn_gcm(GCMInfo pn_gcm) {
        this.pn_gcm = pn_gcm;
        return this;
    }
}
