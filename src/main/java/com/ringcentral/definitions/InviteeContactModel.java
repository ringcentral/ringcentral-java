package com.ringcentral.definitions;


public class InviteeContactModel
{
    /**
     * First (given) name
     * Example: John
     */
    public String firstName;
    public InviteeContactModel firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last (family) name
     * Example: Doe
     */
    public String lastName;
    public InviteeContactModel lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * User&#039;s contact email
     * Format: email
     * Example: john.doe@example.com
     */
    public String email;
    public InviteeContactModel email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Job title
     * Example: Product Manager
     */
    public String jobTitle;
    public InviteeContactModel jobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
        return this;
    }
}