package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteExtension
 */
public class DeleteExtensionParameters {
    /**
     * If `true`, the digital lines from the deleted extension are saved in inventory.
     */
    public Boolean savePhoneLines;
    /**
     * If `true`, the phone numbers from the deleted extension are saved in inventory.
     * Default: true
     */
    public Boolean savePhoneNumbers;

    public DeleteExtensionParameters savePhoneLines(Boolean savePhoneLines) {
        this.savePhoneLines = savePhoneLines;
        return this;
    }

    public DeleteExtensionParameters savePhoneNumbers(Boolean savePhoneNumbers) {
        this.savePhoneNumbers = savePhoneNumbers;
        return this;
    }
}
