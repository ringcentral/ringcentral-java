package com.ringcentral.definitions;


    /**
* Request body for operation createCustomUserGreeting
*/
public class CreateCustomUserGreetingRequest
{
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Required
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic, TemplateGreeting
     */
    public String type;
    public CreateCustomUserGreetingRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Internal identifier of an answering rule
     * Required
     */
    public String answeringRuleId;
    public CreateCustomUserGreetingRequest answeringRuleId(String answeringRuleId)
    {
        this.answeringRuleId = answeringRuleId;
        return this;
    }

    /**
     * Media file to upload
     * Required
     */
    public Attachment binary;
    public CreateCustomUserGreetingRequest binary(Attachment binary)
    {
        this.binary = binary;
        return this;
    }
}