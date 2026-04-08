package com.ringcentral.definitions;


    /**
* Query parameters for operation deleteExtension
*/
public class DeleteExtensionParameters
{
    /**
     * If `true`, the digital lines from the deleted extension are saved in inventory.
     */
    public Boolean savePhoneLines;
    public DeleteExtensionParameters savePhoneLines(Boolean savePhoneLines)
    {
        this.savePhoneLines = savePhoneLines;
        return this;
    }

    /**
     * If `true`, the phone numbers from the deleted extension are saved in inventory.
     * Default: true
     */
    public Boolean savePhoneNumbers;
    public DeleteExtensionParameters savePhoneNumbers(Boolean savePhoneNumbers)
    {
        this.savePhoneNumbers = savePhoneNumbers;
        return this;
    }
}