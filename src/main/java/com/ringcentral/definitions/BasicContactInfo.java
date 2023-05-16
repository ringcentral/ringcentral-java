package com.ringcentral.definitions;


/**
 * Personal contact information
 */
public class BasicContactInfo {
    /**
     * Given name
     * Example: John
     */
    public String firstName;
    /**
     * Family name
     * Example: Smith
     */
    public String lastName;
    /**
     * Contact email
     * Format: email
     * Example: john.smith@acme.com
     */
    public String email;

    public BasicContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BasicContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BasicContactInfo email(String email) {
        this.email = email;
        return this;
    }
}
