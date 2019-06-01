package com.ringcentral.definitions;


public class Name {
    /**
     * Required
     */
    public String familyName;
    /**
     * Required
     */
    public String givenName;

    public Name familyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public Name givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

}
