package com.ringcentral.definitions;


public class CreateGlipMember {
    /**
     * Internal identifier of a user
     */
    public String id;
    /**
     * Email of a user
     */
    public String email;

    public CreateGlipMember id(String id) {
        this.id = id;
        return this;
    }

    public CreateGlipMember email(String email) {
        this.email = email;
        return this;
    }

}
