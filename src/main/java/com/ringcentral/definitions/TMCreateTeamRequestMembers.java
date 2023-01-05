package com.ringcentral.definitions;


public class TMCreateTeamRequestMembers
{
    /**
     * Internal identifier of a person
     */
    public String id;
    public TMCreateTeamRequestMembers id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Email of a person
     * Format: email
     */
    public String email;
    public TMCreateTeamRequestMembers email(String email)
    {
        this.email = email;
        return this;
    }
}