package com.ringcentral.definitions;


    /**
* Additional info about the key
*/
public class AnalyticsLegacyKeyInfo
{
    /**
     */
    public String extensionNumber;
    public AnalyticsLegacyKeyInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public String name;
    public AnalyticsLegacyKeyInfo name(String name)
    {
        this.name = name;
        return this;
    }
}