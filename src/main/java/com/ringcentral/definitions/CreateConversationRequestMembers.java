package com.ringcentral.definitions;


public class CreateConversationRequestMembers {
    /**
     * Internal identifier of a person
     */
    public String id;
    /**
     * Email of a person
     * Format: email
     */
    public String email;

    public CreateConversationRequestMembers id(String id) {
        this.id = id;
        return this;
    }

    public CreateConversationRequestMembers email(String email) {
        this.email = email;
        return this;
    }
}
