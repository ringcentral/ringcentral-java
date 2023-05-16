package com.ringcentral.definitions;


public class AccountPhoneNumberInfoExtension {
    /**
     * Unique identifier of extension
     * Example: 1234567
     */
    public String id;
    /**
     * Short number of an extension.
     * Actual max length depends on system length limit for extension.
     * Example: 205
     */
    public String extensionNumber;

    public AccountPhoneNumberInfoExtension id(String id) {
        this.id = id;
        return this;
    }

    public AccountPhoneNumberInfoExtension extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
