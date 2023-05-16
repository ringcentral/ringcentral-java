package com.ringcentral.definitions;


/**
 * Personal contact information
 */
public class SystemUserContactInfo {
    /**
     * Given name
     * Required
     * Example: John
     */
    public String firstName;
    /**
     * Family name
     * Required
     * Example: Smith
     */
    public String lastName;
    /**
     * Contact email
     * Required
     * Format: email
     * Example: john.smith@acme.com
     */
    public String email;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String contactPhone;
    /**
     * Internal identifier of System user extension
     * Required
     */
    public String id;
    /**
     * Short number of an extension.
     * Actual max length depends on system length limit for extension.
     * Required
     * Example: 205
     */
    public String extensionNumber;

    public SystemUserContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public SystemUserContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public SystemUserContactInfo email(String email) {
        this.email = email;
        return this;
    }

    public SystemUserContactInfo contactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public SystemUserContactInfo id(String id) {
        this.id = id;
        return this;
    }

    public SystemUserContactInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
