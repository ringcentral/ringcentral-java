package com.ringcentral.definitions;


public class BatchProvisionUsersRequestItemContact {
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
    public String mobileNumber;
    /**
     * Indicates that contact email is enabled as login name for this user.
     * Please note that email must be unique in this case.
     * Default: true
     */
    public Boolean emailAsLoginName;

    public BatchProvisionUsersRequestItemContact firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BatchProvisionUsersRequestItemContact lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BatchProvisionUsersRequestItemContact email(String email) {
        this.email = email;
        return this;
    }

    public BatchProvisionUsersRequestItemContact mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public BatchProvisionUsersRequestItemContact emailAsLoginName(Boolean emailAsLoginName) {
        this.emailAsLoginName = emailAsLoginName;
        return this;
    }
}
