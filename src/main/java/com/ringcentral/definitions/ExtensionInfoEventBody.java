package com.ringcentral.definitions;


// Notification payload body
public class ExtensionInfoEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Type of extension info change
     * Enum: Update, Delete
     */
    public String eventType;
    /**
     * Returned for &#039;Update&#039; event type only
     * Enum: AccountSettings, AccountStatus, AnsweringRules, CompanyNumbers, DialingPlan, ExtensionInfo, Features, Limits, Permissions, ProfileImage, VideoConfiguration
     */
    public String[] hints;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public ExtensionInfoEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionInfoEventBody eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public ExtensionInfoEventBody hints(String[] hints) {
        this.hints = hints;
        return this;
    }

    public ExtensionInfoEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
}
