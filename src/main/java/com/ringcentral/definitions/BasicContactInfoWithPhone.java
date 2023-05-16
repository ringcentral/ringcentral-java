package com.ringcentral.definitions;


/**
 * Personal contact information
 */
public class BasicContactInfoWithPhone {
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
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String contactPhone;

    public BasicContactInfoWithPhone firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BasicContactInfoWithPhone lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BasicContactInfoWithPhone email(String email) {
        this.email = email;
        return this;
    }

    public BasicContactInfoWithPhone contactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
}
