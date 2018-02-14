package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionInfoEvent
{
    // Internal identifier of an extension
    public String extensionId;
    public ExtensionInfoEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Type of extension info change
    public String eventType;
    public ExtensionInfoEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    // Returned for 'Update' event type only. The possible values are: /nAccountInfo - change of account parameters/nExtensionInfo - change of contact info, service features, departments, status/nPhoneNumber - change of phone numbers/nRole - change of permissions/nProfileImage - change of profile image
    public String[] hints;
    public ExtensionInfoEvent hints(String[] hints) {
        this.hints = hints;
        return this;
    }
}
