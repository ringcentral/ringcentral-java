package com.ringcentral.definitions;

/** Request body for operation createCustomUserGreeting */
public class CreateCustomUserGreetingRequest {
    /**
     * Type of greeting, specifying the case when the greeting is played. Required Enum:
     * Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable,
     * HoldMusic, TemplateGreeting
     */
    public String type;

    public CreateCustomUserGreetingRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Media file to upload Required */
    public Attachment binary;

    public CreateCustomUserGreetingRequest binary(Attachment binary) {
        this.binary = binary;
        return this;
    }

    /** */
    public GreetingAnsweringRuleId answeringRule;

    public CreateCustomUserGreetingRequest answeringRule(GreetingAnsweringRuleId answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
