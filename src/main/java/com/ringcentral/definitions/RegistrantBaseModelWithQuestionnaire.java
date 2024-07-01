package com.ringcentral.definitions;


public class RegistrantBaseModelWithQuestionnaire {
    /**
     * First (given) name
     * Required
     * Example: John
     */
    public String firstName;
    /**
     * Last (family) name
     * Required
     * Example: Doe
     */
    public String lastName;
    /**
     * User&#039;s contact email
     * Required
     * Format: email
     * Example: john.doe@example.com
     */
    public String email;
    /**
     * The personalized URI for this registrant to join the Webinar
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String joinUri;
    /**
     * The personalized URI for this registrant to cancel the registration
     * Format: uri
     * Example: https://abcde12345.webinar.ringcentral.com/register?jlt=iuyef77fsj473wn10ashjfk34&amp;action=cancel
     */
    public String cancellationUri;
    /**
     * Indicates if the registrant was registered to on-demand webinar
     */
    public Boolean registeredPostWebinar;
    /**
     * Visitor ID passed from registration page
     */
    public String visitorId;
    /**
     * ID of a registrant passed from external system
     */
    public String externalId;
    /**
     * Registration time (can be earlier than &quot;creationTime&quot; due to indirect persistence)
     * Format: date-time
     */
    public String registrationTime;
    /**
     * IP address of the registrant&#039;s user agent
     * Format: ipv4
     */
    public String ipAddress;
    /**
     * Registration channel source (coming from registration URI)
     */
    public String source;
    /**
     * ID of session participant (from Runtime Service - if this registrant attended the webinar)
     */
    public String participantId;
    /**
     * Answers on custom registration questions
     */
    public RegAnswerModel[] questionnaire;

    public RegistrantBaseModelWithQuestionnaire firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire email(String email) {
        this.email = email;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire cancellationUri(String cancellationUri) {
        this.cancellationUri = cancellationUri;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire registeredPostWebinar(Boolean registeredPostWebinar) {
        this.registeredPostWebinar = registeredPostWebinar;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire visitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire registrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire source(String source) {
        this.source = source;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire participantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    public RegistrantBaseModelWithQuestionnaire questionnaire(RegAnswerModel[] questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }
}
