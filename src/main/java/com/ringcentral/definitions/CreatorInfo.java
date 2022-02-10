package com.ringcentral.definitions;


/**
 * Task creator information
 */
public class CreatorInfo {
    /**
     * Internal identifier of a user
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

    public CreatorInfo id(String id) {
        this.id = id;
        return this;
    }

    public CreatorInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CreatorInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
