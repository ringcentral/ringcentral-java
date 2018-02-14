package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionPresenceLineEvent
{
    // Extension information
    public ExtensionNotificationInfo extension;
    public ExtensionPresenceLineEvent extension(ExtensionNotificationInfo extension) {
        this.extension = extension;
        return this;
    }
    // Order number of a notification to state the chronology
    public Long sequence;
    public ExtensionPresenceLineEvent sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }
}
