package com.ringcentral.definitions;


public class AccountLanguageInfoRequest
{
    /**
     * Internal identifier of a language set as regional
     * Required
     */
    public String id;
    public AccountLanguageInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Localization code of a language set as regional
     * Required
     */
    public String localeCode;
    public AccountLanguageInfoRequest localeCode(String localeCode)
    {
        this.localeCode = localeCode;
        return this;
    }
}