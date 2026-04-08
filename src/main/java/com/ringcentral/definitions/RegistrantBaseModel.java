package com.ringcentral.definitions;


public class RegistrantBaseModel
{
    /**
     * First (given) name
     * Required
     * Example: John
     */
    public String firstName;
    public RegistrantBaseModel firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last (family) name
     * Required
     * Example: Doe
     */
    public String lastName;
    public RegistrantBaseModel lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * User&#039;s contact email
     * Required
     * Format: email
     * Example: john.doe@example.com
     */
    public String email;
    public RegistrantBaseModel email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * The personalized URI for this registrant to join the Webinar
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String joinUri;
    public RegistrantBaseModel joinUri(String joinUri)
    {
        this.joinUri = joinUri;
        return this;
    }

    /**
     * The personalized URI for this registrant to cancel the registration
     * Format: uri
     * Example: https://abcde12345.webinar.ringcentral.com/register?jlt=iuyef77fsj473wn10ashjfk34&amp;action=cancel
     */
    public String cancellationUri;
    public RegistrantBaseModel cancellationUri(String cancellationUri)
    {
        this.cancellationUri = cancellationUri;
        return this;
    }

    /**
     * Indicates if the registrant was registered to on-demand webinar
     */
    public Boolean registeredPostWebinar;
    public RegistrantBaseModel registeredPostWebinar(Boolean registeredPostWebinar)
    {
        this.registeredPostWebinar = registeredPostWebinar;
        return this;
    }

    /**
     * Visitor ID passed from registration page
     */
    public String visitorId;
    public RegistrantBaseModel visitorId(String visitorId)
    {
        this.visitorId = visitorId;
        return this;
    }

    /**
     * ID of a registrant passed from external system
     */
    public String externalId;
    public RegistrantBaseModel externalId(String externalId)
    {
        this.externalId = externalId;
        return this;
    }

    /**
     * Registration time (can be earlier than &quot;creationTime&quot; due to indirect persistence)
     * Format: date-time
     */
    public String registrationTime;
    public RegistrantBaseModel registrationTime(String registrationTime)
    {
        this.registrationTime = registrationTime;
        return this;
    }

    /**
     * IP address of the registrant&#039;s user agent
     * Format: ipv4
     */
    public String ipAddress;
    public RegistrantBaseModel ipAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Registration channel source (coming from registration URI)
     */
    public String source;
    public RegistrantBaseModel source(String source)
    {
        this.source = source;
        return this;
    }

    /**
     * ID of session participant (from Runtime Service - if this registrant attended the webinar)
     */
    public String participantId;
    public RegistrantBaseModel participantId(String participantId)
    {
        this.participantId = participantId;
        return this;
    }
}