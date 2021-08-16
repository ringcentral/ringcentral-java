package com.ringcentral.definitions;


public class UserCustomFieldResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String value;

    public UserCustomFieldResource id(String id) {
        this.id = id;
        return this;
    }

    public UserCustomFieldResource value(String value) {
        this.value = value;
        return this;
    }
}
