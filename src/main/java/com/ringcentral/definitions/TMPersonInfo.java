package com.ringcentral.definitions;


public class TMPersonInfo
{
    /**
     * Internal identifier of a user
     * Required
     */
    public String id;
    public TMPersonInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * First name of a user
     */
    public String firstName;
    public TMPersonInfo firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of a user
     */
    public String lastName;
    public TMPersonInfo lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * Email of a user
     * Format: email
     */
    public String email;
    public TMPersonInfo email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Photo of a user
     */
    public String avatar;
    public TMPersonInfo avatar(String avatar)
    {
        this.avatar = avatar;
        return this;
    }

    /**
     * Internal identifier of a company
     */
    public String companyId;
    public TMPersonInfo companyId(String companyId)
    {
        this.companyId = companyId;
        return this;
    }

    /**
     * Time of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    public TMPersonInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Time of the last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMPersonInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}