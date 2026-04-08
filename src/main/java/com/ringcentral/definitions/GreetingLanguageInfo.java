package com.ringcentral.definitions;


    /**
* Information on language used for telephony greetings
* 
*/
public class GreetingLanguageInfo
{
    /**
     * Internal identifier of a greeting language
     */
    public String id;
    public GreetingLanguageInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Localization code of a greeting language
     */
    public String localeCode;
    public GreetingLanguageInfo localeCode(String localeCode)
    {
        this.localeCode = localeCode;
        return this;
    }

    /**
     * Official name of a greeting language
     */
    public String name;
    public GreetingLanguageInfo name(String name)
    {
        this.name = name;
        return this;
    }
}