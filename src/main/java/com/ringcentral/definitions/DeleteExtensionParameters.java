package com.ringcentral.definitions;


    /**
* Query parameters for operation deleteExtension
*/
public class DeleteExtensionParameters
{
    /**
     */
    public Boolean savePhoneLines;
    public DeleteExtensionParameters savePhoneLines(Boolean savePhoneLines)
    {
        this.savePhoneLines = savePhoneLines;
        return this;
    }

    /**
     * Default: true
     */
    public Boolean savePhoneNumbers;
    public DeleteExtensionParameters savePhoneNumbers(Boolean savePhoneNumbers)
    {
        this.savePhoneNumbers = savePhoneNumbers;
        return this;
    }
}