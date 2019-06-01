package com.ringcentral.definitions;


public class GlipPersonInfo {
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
     */
    public String creationTime;
    /**
     * Time of the last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;

    public GlipPersonInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipPersonInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public GlipPersonInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public GlipPersonInfo email(String email) {
        this.email = email;
        return this;
    }

    public GlipPersonInfo avatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public GlipPersonInfo companyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public GlipPersonInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipPersonInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}
