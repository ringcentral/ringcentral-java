package com.ringcentral.definitions;


public class TMPersonInfo {
    /**
     * Internal identifier of a user
     * Required
     */
    public String id;
    /**
     * First name of a user
     */
    public String firstName;
    /**
     * Last name of a user
     */
    public String lastName;
    /**
     * Email of a user
     * Format: email
     */
    public String email;
    /**
     * Photo of a user
     */
    public String avatar;
    /**
     * Internal identifier of a company
     */
    public String companyId;
    /**
     * Time of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Time of the last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;

    public TMPersonInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMPersonInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TMPersonInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public TMPersonInfo email(String email) {
        this.email = email;
        return this;
    }

    public TMPersonInfo avatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public TMPersonInfo companyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public TMPersonInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMPersonInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
