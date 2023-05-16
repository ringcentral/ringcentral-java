package com.ringcentral.definitions;


/**
 * To use as selection criteria when a number to be selected from the number pool.
 */
public class PhoneNumberDefinitionTollType {
    /**
     * Indicates if a number is toll or toll-free
     * Required
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;

    public PhoneNumberDefinitionTollType tollType(String tollType) {
        this.tollType = tollType;
        return this;
    }
}
