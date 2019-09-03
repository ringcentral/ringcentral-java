package com.ringcentral.definitions;


public class CreateCompanyGreetingRequest {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Company, StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    /**
     * Internal identifier of a language. See Get Language List
     */
    public String languageId;
    /**
     * Meida file to upload
     */
    public Attachment binary;
    /**
     *
     */
    public CustomCompanyGreetingAnsweringRuleInfo answeringRule;

    public CreateCompanyGreetingRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateCompanyGreetingRequest languageId(String languageId) {
        this.languageId = languageId;
        return this;
    }

    public CreateCompanyGreetingRequest binary(Attachment binary) {
        this.binary = binary;
        return this;
    }

    public CreateCompanyGreetingRequest answeringRule(CustomCompanyGreetingAnsweringRuleInfo answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }

}
