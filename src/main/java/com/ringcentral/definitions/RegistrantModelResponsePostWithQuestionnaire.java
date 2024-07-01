package com.ringcentral.definitions;


public class RegistrantModelResponsePostWithQuestionnaire {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    /**
     * Object creation time
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Object last modification time
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
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
    /**
     * Sequence number for iCalendar email attachments
     * Format: int32
     */
    public Long icalendarSequence;

    public RegistrantModelResponsePostWithQuestionnaire id(String id) {
        this.id = id;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire email(String email) {
        this.email = email;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire cancellationUri(String cancellationUri) {
        this.cancellationUri = cancellationUri;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire registeredPostWebinar(Boolean registeredPostWebinar) {
        this.registeredPostWebinar = registeredPostWebinar;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire visitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire registrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire source(String source) {
        this.source = source;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire participantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire questionnaire(RegAnswerModel[] questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }

    public RegistrantModelResponsePostWithQuestionnaire icalendarSequence(Long icalendarSequence) {
        this.icalendarSequence = icalendarSequence;
        return this;
    }
}
