package com.ringcentral.definitions;


    /**
* Information on a language set as regional
*/
public class RegionalLanguageInfo
{
    /**
     * Internal identifier of a language set as regional
     */
    public String id;
    public RegionalLanguageInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Localization code of a language set as regional
     */
    public String localeCode;
    public RegionalLanguageInfo localeCode(String localeCode)
    {
        this.localeCode = localeCode;
        return this;
    }

    /**
     * Official name of a language set as regional
     */
    public String name;
    public RegionalLanguageInfo name(String name)
    {
        this.name = name;
        return this;
    }
}