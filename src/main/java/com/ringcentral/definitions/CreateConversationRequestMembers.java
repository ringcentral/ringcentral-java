package com.ringcentral.definitions;


public class CreateConversationRequestMembers
{
    /**
     * Internal identifier of a person
     */
    public String id;
    public CreateConversationRequestMembers id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Email of a person
     * Format: email
     */
    public String email;
    public CreateConversationRequestMembers email(String email)
    {
        this.email = email;
        return this;
    }
}