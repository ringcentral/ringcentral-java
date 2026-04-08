package com.ringcentral.definitions;


    /**
* Appearance phone numbers information. Supported only for Delegated Lines Group extensions
*/
public class AppearancesInfo
{
    /**
     * Appearance phone number
     */
    public String phoneNumber;
    public AppearancesInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Appearance number. The value range is from 1 to 8
     * Format: int32
     */
    public Long appearanceNumber;
    public AppearancesInfo appearanceNumber(Long appearanceNumber)
    {
        this.appearanceNumber = appearanceNumber;
        return this;
    }

    /**
     * Appearance line status. The two possible values: &#039;Seized&#039; - the phone line is busy; &#039;Released&#039; - the phone line is open
     * Enum: Seized, Released
     */
    public String lineStatus;
    public AppearancesInfo lineStatus(String lineStatus)
    {
        this.lineStatus = lineStatus;
        return this;
    }
}