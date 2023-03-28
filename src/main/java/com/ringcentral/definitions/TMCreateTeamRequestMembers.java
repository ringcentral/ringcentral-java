package com.ringcentral.definitions;


public class TMCreateTeamRequestMembers {
    /**
     * Internal identifier of a person
     */
    public String id;
    /**
     * Email of a person
     * Format: email
     */
    public String email;

    public TMCreateTeamRequestMembers id(String id) {
        this.id = id;
        return this;
    }

    public TMCreateTeamRequestMembers email(String email) {
        this.email = email;
        return this;
    }
}
