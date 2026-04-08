package com.ringcentral.definitions;


public class ScimName
{
    /**
     * Required
     */
    public String familyName;
    public ScimName familyName(String familyName)
    {
        this.familyName = familyName;
        return this;
    }

    /**
     * Required
     */
    public String givenName;
    public ScimName givenName(String givenName)
    {
        this.givenName = givenName;
        return this;
    }
}