package com.ringcentral.definitions;


/**
 * Request body for operation createCustomUserGreeting
 */
public class CreateCustomUserGreetingRequest {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Required
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic, TemplateGreeting
     */
    public String type;
    /**
     * Media file to upload
     * Required
     */
    public Attachment binary;
    /**
     *
     */
    public GreetingAnsweringRuleId answeringRule;

    public CreateCustomUserGreetingRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateCustomUserGreetingRequest binary(Attachment binary) {
        this.binary = binary;
        return this;
    }

    public CreateCustomUserGreetingRequest answeringRule(GreetingAnsweringRuleId answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
