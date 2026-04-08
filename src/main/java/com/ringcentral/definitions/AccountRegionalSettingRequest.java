package com.ringcentral.definitions;


public class AccountRegionalSettingRequest
{
    /**
     */
    public AccountCountryInfoRequest homeCountry;
    public AccountRegionalSettingRequest homeCountry(AccountCountryInfoRequest homeCountry)
    {
        this.homeCountry = homeCountry;
        return this;
    }

    /**
     * Required
     */
    public AccountTimezoneInfoRequest timezone;
    public AccountRegionalSettingRequest timezone(AccountTimezoneInfoRequest timezone)
    {
        this.timezone = timezone;
        return this;
    }

    /**
     */
    public AccountLanguageInfoRequest language;
    public AccountRegionalSettingRequest language(AccountLanguageInfoRequest language)
    {
        this.language = language;
        return this;
    }

    /**
     */
    public AccountGreetingLanguageInfoRequest greetingLanguage;
    public AccountRegionalSettingRequest greetingLanguage(AccountGreetingLanguageInfoRequest greetingLanguage)
    {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    /**
     */
    public AccountFormattingLocaleInfoRequest formattingLocale;
    public AccountRegionalSettingRequest formattingLocale(AccountFormattingLocaleInfoRequest formattingLocale)
    {
        this.formattingLocale = formattingLocale;
        return this;
    }

    /**
     * Time format (12-hours or 24-hours).
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;
    public AccountRegionalSettingRequest timeFormat(String timeFormat)
    {
        this.timeFormat = timeFormat;
        return this;
    }
}