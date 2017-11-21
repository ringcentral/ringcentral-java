package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PresencePermissions
{
    //
    public String targetExtensionId;
    public PresencePermissions targetExtensionId(String targetExtensionId) {
        this.targetExtensionId = targetExtensionId;
        return this;
    }
    //
    public String subscriberExtensionId;
    public PresencePermissions subscriberExtensionId(String subscriberExtensionId) {
        this.subscriberExtensionId = subscriberExtensionId;
        return this;
    }
    //
    public Boolean canReadPresenceStatus;
    public PresencePermissions canReadPresenceStatus(Boolean canReadPresenceStatus) {
        this.canReadPresenceStatus = canReadPresenceStatus;
        return this;
    }
    //
    public Boolean canReadPresenceSettings;
    public PresencePermissions canReadPresenceSettings(Boolean canReadPresenceSettings) {
        this.canReadPresenceSettings = canReadPresenceSettings;
        return this;
    }
    //
    public Boolean canPickup;
    public PresencePermissions canPickup(Boolean canPickup) {
        this.canPickup = canPickup;
        return this;
    }
}
