package com.ringcentral.definitions;


    /**
* Consent coverage setting for the TCR campaign.
*/
public class ConsentSettingsCoverage
{
    /**
     * Coverage type.
     * Enum: PhoneNumber, Account, Conversational, Informational, Promotional
     */
    public String optIn;
    public ConsentSettingsCoverage optIn(String optIn)
    {
        this.optIn = optIn;
        return this;
    }

    /**
     * Coverage type.
     * Enum: PhoneNumber, Account, Conversational, Informational, Promotional
     */
    public String optOut;
    public ConsentSettingsCoverage optOut(String optOut)
    {
        this.optOut = optOut;
        return this;
    }
}