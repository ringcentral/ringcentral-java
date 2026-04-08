package com.ringcentral.definitions;


public class RegistrantMinimalModel
{
    /**
     * First (given) name
     * Required
     * Example: John
     */
    public String firstName;
    public RegistrantMinimalModel firstName(String firstName)
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
    public RegistrantMinimalModel lastName(String lastName)
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
    public RegistrantMinimalModel email(String email)
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
    public RegistrantMinimalModel joinUri(String joinUri)
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
    public RegistrantMinimalModel cancellationUri(String cancellationUri)
    {
        this.cancellationUri = cancellationUri;
        return this;
    }

    /**
     * Indicates if the registrant was registered to on-demand webinar
     */
    public Boolean registeredPostWebinar;
    public RegistrantMinimalModel registeredPostWebinar(Boolean registeredPostWebinar)
    {
        this.registeredPostWebinar = registeredPostWebinar;
        return this;
    }
}