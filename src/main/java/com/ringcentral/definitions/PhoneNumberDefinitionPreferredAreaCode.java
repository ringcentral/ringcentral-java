package com.ringcentral.definitions;


/**
 * To use as selection hint when a "toll" number to be selected from the number pool.
 */
public class PhoneNumberDefinitionPreferredAreaCode {
    /**
     * Preferred area code to use if numbers available
     * Required
     * Example: 650
     */
    public String preferredAreaCode;

    public PhoneNumberDefinitionPreferredAreaCode preferredAreaCode(String preferredAreaCode) {
        this.preferredAreaCode = preferredAreaCode;
        return this;
    }
}
