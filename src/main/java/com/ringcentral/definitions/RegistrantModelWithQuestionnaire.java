package com.ringcentral.definitions;

public class RegistrantModelWithQuestionnaire {
    /** Internal object ID Example: 78654321 */
    public String id;

    public RegistrantModelWithQuestionnaire id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public RegistrantModelWithQuestionnaire creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public RegistrantModelWithQuestionnaire lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** First (given) name Required Example: John */
    public String firstName;

    public RegistrantModelWithQuestionnaire firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Required Example: Doe */
    public String lastName;

    public RegistrantModelWithQuestionnaire lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** User&#039;s contact email Required Format: email Example: john.doe@example.com */
    public String email;

    public RegistrantModelWithQuestionnaire email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The personalized URI for this registrant to join the Webinar Format: uri Example:
     * https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String joinUri;

    public RegistrantModelWithQuestionnaire joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

    /**
     * The personalized URI for this registrant to cancel the registration Format: uri Example:
     * https://abcde12345.webinar.ringcentral.com/register?jlt=iuyef77fsj473wn10ashjfk34&amp;action=cancel
     */
    public String cancellationUri;

    public RegistrantModelWithQuestionnaire cancellationUri(String cancellationUri) {
        this.cancellationUri = cancellationUri;
        return this;
    }

    /** Indicates if the registrant was registered to on-demand webinar */
    public Boolean registeredPostWebinar;

    public RegistrantModelWithQuestionnaire registeredPostWebinar(Boolean registeredPostWebinar) {
        this.registeredPostWebinar = registeredPostWebinar;
        return this;
    }

    /** Visitor ID passed from registration page */
    public String visitorId;

    public RegistrantModelWithQuestionnaire visitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }

    /** ID of a registrant passed from external system */
    public String externalId;

    public RegistrantModelWithQuestionnaire externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Registration time (can be earlier than &quot;creationTime&quot; due to indirect persistence)
     * Format: date-time
     */
    public String registrationTime;

    public RegistrantModelWithQuestionnaire registrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    /** IP address of the registrant&#039;s user agent Format: ipv4 */
    public String ipAddress;

    public RegistrantModelWithQuestionnaire ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /** Registration channel source (coming from registration URI) */
    public String source;

    public RegistrantModelWithQuestionnaire source(String source) {
        this.source = source;
        return this;
    }

    /**
     * ID of session participant (from Runtime Service - if this registrant attended the webinar)
     */
    public String participantId;

    public RegistrantModelWithQuestionnaire participantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /** Answers on custom registration questions */
    public RegAnswerModel[] questionnaire;

    public RegistrantModelWithQuestionnaire questionnaire(RegAnswerModel[] questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }
}
