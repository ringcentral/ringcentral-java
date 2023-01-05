package com.ringcentral.definitions;


public class ExtensionRegionalSettingRequest
{
    /**
     */
    public ExtensionCountryInfoRequest homeCountry;
    public ExtensionRegionalSettingRequest homeCountry(ExtensionCountryInfoRequest homeCountry)
    {
        this.homeCountry = homeCountry;
        return this;
    }

    /**
     */
    public ExtensionTimezoneInfoRequest timezone;
    public ExtensionRegionalSettingRequest timezone(ExtensionTimezoneInfoRequest timezone)
    {
        this.timezone = timezone;
        return this;
    }

    /**
     */
    public ExtensionLanguageInfoRequest language;
    public ExtensionRegionalSettingRequest language(ExtensionLanguageInfoRequest language)
    {
        this.language = language;
        return this;
    }

    /**
     */
    public ExtensionGreetingLanguageInfoRequest greetingLanguage;
    public ExtensionRegionalSettingRequest greetingLanguage(ExtensionGreetingLanguageInfoRequest greetingLanguage)
    {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    /**
     */
    public ExtensionFormattingLocaleInfoRequest formattingLocale;
    public ExtensionRegionalSettingRequest formattingLocale(ExtensionFormattingLocaleInfoRequest formattingLocale)
    {
        this.formattingLocale = formattingLocale;
        return this;
    }

    /**
     * Time format setting
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;
    public ExtensionRegionalSettingRequest timeFormat(String timeFormat)
    {
        this.timeFormat = timeFormat;
        return this;
    }
}