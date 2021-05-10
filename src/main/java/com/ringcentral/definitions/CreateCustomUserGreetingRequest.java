package com.ringcentral.definitions;


// Request body for operation createCustomUserGreeting
public class CreateCustomUserGreetingRequest {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Required
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic
     */
    public String type;
    /**
     * Internal identifier of an answering rule
     */
    public String answeringRuleId;
    /**
     * Media file to upload
     * Required
     */
    public Attachment binary;

    public CreateCustomUserGreetingRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateCustomUserGreetingRequest answeringRuleId(String answeringRuleId) {
        this.answeringRuleId = answeringRuleId;
        return this;
    }

    public CreateCustomUserGreetingRequest binary(Attachment binary) {
        this.binary = binary;
        return this;
    }
}
