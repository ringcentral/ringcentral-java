package com.ringcentral.definitions;

/** Personal contact information */
public class BasicContactInfoWithPhone {
    /** Given name Example: John */
    public String firstName;

    public BasicContactInfoWithPhone firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Family name Example: Smith */
    public String lastName;

    public BasicContactInfoWithPhone lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** Contact email Format: email Example: john.smith@acme.com */
    public String email;

    public BasicContactInfoWithPhone email(String email) {
        this.email = email;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Example: +16501234567 */
    public String contactPhone;

    public BasicContactInfoWithPhone contactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
}
