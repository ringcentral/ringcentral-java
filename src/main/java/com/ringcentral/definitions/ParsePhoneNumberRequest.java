package com.ringcentral.definitions;


public class ParsePhoneNumberRequest
{
    /**
     * The list of phone numbers passed as an array of strings (not more than 64 items). The maximum size of each string is 64 characters
     */
    public String[] originalStrings;
    public ParsePhoneNumberRequest originalStrings(String[] originalStrings)
    {
        this.originalStrings = originalStrings;
        return this;
    }
}