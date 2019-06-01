package com.ringcentral.definitions;


public class CreateCustomUserGreetingRequest {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic
     */
    public String type;
    /**
     * Meida file to upload
     */
    public Attachment binary;
    /**
     *
     */
    public CustomGreetingAnsweringRuleInfoRequest answeringRule;

    public CreateCustomUserGreetingRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateCustomUserGreetingRequest binary(Attachment binary) {
        this.binary = binary;
        return this;
    }

    public CreateCustomUserGreetingRequest answeringRule(CustomGreetingAnsweringRuleInfoRequest answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }

}
