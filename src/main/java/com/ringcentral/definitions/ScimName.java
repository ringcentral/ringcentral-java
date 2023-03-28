package com.ringcentral.definitions;


public class ScimName {
    /**
     * Required
     */
    public String familyName;
    /**
     * Required
     */
    public String givenName;

    public ScimName familyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public ScimName givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }
}
