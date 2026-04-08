package com.ringcentral.definitions;

/** Request body for operation createCompanyGreeting */
public class CreateCompanyGreetingRequest {
    /**
     * Type of greeting, specifying the case when the greeting is played. Required Enum: Company,
     * StartRecording, StopRecording, AutomaticRecording, TemplateGreeting
     */
    public String type;

    public CreateCompanyGreetingRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Internal identifier of a language. See Get Language List */
    public String languageId;

    public CreateCompanyGreetingRequest languageId(String languageId) {
        this.languageId = languageId;
        return this;
    }

    /** Media file to upload Required */
    public Attachment binary;

    public CreateCompanyGreetingRequest binary(Attachment binary) {
        this.binary = binary;
        return this;
    }

    /** */
    public GreetingAnsweringRuleId answeringRule;

    public CreateCompanyGreetingRequest answeringRule(GreetingAnsweringRuleId answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
