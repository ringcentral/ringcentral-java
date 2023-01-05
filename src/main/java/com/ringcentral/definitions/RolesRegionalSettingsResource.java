package com.ringcentral.definitions;


public class RolesRegionalSettingsResource
{
    /**
     */
    public RolesTimezoneResource timezone;
    public RolesRegionalSettingsResource timezone(RolesTimezoneResource timezone)
    {
        this.timezone = timezone;
        return this;
    }

    /**
     */
    public RolesCountryResource homeCountry;
    public RolesRegionalSettingsResource homeCountry(RolesCountryResource homeCountry)
    {
        this.homeCountry = homeCountry;
        return this;
    }

    /**
     */
    public RolesLanguageResource language;
    public RolesRegionalSettingsResource language(RolesLanguageResource language)
    {
        this.language = language;
        return this;
    }

    /**
     */
    public RolesLanguageResource greetingLanguage;
    public RolesRegionalSettingsResource greetingLanguage(RolesLanguageResource greetingLanguage)
    {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    /**
     */
    public RolesLanguageResource formattingLocale;
    public RolesRegionalSettingsResource formattingLocale(RolesLanguageResource formattingLocale)
    {
        this.formattingLocale = formattingLocale;
        return this;
    }

    /**
     * Enum: 12h, 24h
     */
    public String timeFormat;
    public RolesRegionalSettingsResource timeFormat(String timeFormat)
    {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     */
    public CurrencyResource currency;
    public RolesRegionalSettingsResource currency(CurrencyResource currency)
    {
        this.currency = currency;
        return this;
    }
}