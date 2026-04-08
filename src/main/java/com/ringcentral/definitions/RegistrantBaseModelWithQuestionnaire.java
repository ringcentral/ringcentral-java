package com.ringcentral.definitions;

public class RegistrantBaseModelWithQuestionnaire {
    /** First (given) name Required Example: John */
    public String firstName;

    public RegistrantBaseModelWithQuestionnaire firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Required Example: Doe */
    public String lastName;

    public RegistrantBaseModelWithQuestionnaire lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** User&#039;s contact email Required Format: email Example: john.doe@example.com */
    public String email;

    public RegistrantBaseModelWithQuestionnaire email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The personalized URI for this registrant to join the Webinar Format: uri Example:
     * https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String joinUri;

    public RegistrantBaseModelWithQuestionnaire joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

    /**
     * The personalized URI for this registrant to cancel the registration Format: uri Example:
     * https://abcde12345.webinar.ringcentral.com/register?jlt=iuyef77fsj473wn10ashjfk34&amp;action=cancel
     */
    public String cancellationUri;

    public RegistrantBaseModelWithQuestionnaire cancellationUri(String cancellationUri) {
        this.cancellationUri = cancellationUri;
        return this;
    }

    /** Indicates if the registrant was registered to on-demand webinar */
    public Boolean registeredPostWebinar;

    public RegistrantBaseModelWithQuestionnaire registeredPostWebinar(
            Boolean registeredPostWebinar) {
        this.registeredPostWebinar = registeredPostWebinar;
        return this;
    }

    /** Visitor ID passed from registration page */
    public String visitorId;

    public RegistrantBaseModelWithQuestionnaire visitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }

    /** ID of a registrant passed from external system */
    public String externalId;

    public RegistrantBaseModelWithQuestionnaire externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Registration time (can be earlier than &quot;creationTime&quot; due to indirect persistence)
     * Format: date-time
     */
    public String registrationTime;

    public RegistrantBaseModelWithQuestionnaire registrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    /** IP address of the registrant&#039;s user agent Format: ipv4 */
    public String ipAddress;

    public RegistrantBaseModelWithQuestionnaire ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /** Registration channel source (coming from registration URI) */
    public String source;

    public RegistrantBaseModelWithQuestionnaire source(String source) {
        this.source = source;
        return this;
    }

    /**
     * ID of session participant (from Runtime Service - if this registrant attended the webinar)
     */
    public String participantId;

    public RegistrantBaseModelWithQuestionnaire participantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /** Answers on custom registration questions */
    public RegAnswerModel[] questionnaire;

    public RegistrantBaseModelWithQuestionnaire questionnaire(RegAnswerModel[] questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }
}
