package com.ringcentral.definitions;


public class InviteeContactModel {
    /**
     * First (given) name
     * Example: John
     */
    public String firstName;
    /**
     * Last (family) name
     * Example: Doe
     */
    public String lastName;
    /**
     * User&#039;s contact email
     * Format: email
     * Example: john.doe@example.com
     */
    public String email;
    /**
     * Job title
     * Example: Product Manager
     */
    public String jobTitle;

    public InviteeContactModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public InviteeContactModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public InviteeContactModel email(String email) {
        this.email = email;
        return this;
    }

    public InviteeContactModel jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
}
