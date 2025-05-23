package com.ringcentral.definitions;


public class AccountRegionalSettingRequest {
    /**
     *
     */
    public AccountCountryInfoRequest homeCountry;
    /**
     *
     */
    public AccountTimezoneInfoRequest timezone;
    /**
     *
     */
    public AccountLanguageInfoRequest language;
    /**
     *
     */
    public AccountGreetingLanguageInfoRequest greetingLanguage;
    /**
     *
     */
    public AccountFormattingLocaleInfoRequest formattingLocale;
    /**
     * Time format (12-hours or 24-hours).
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;

    public AccountRegionalSettingRequest homeCountry(AccountCountryInfoRequest homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public AccountRegionalSettingRequest timezone(AccountTimezoneInfoRequest timezone) {
        this.timezone = timezone;
        return this;
    }

    public AccountRegionalSettingRequest language(AccountLanguageInfoRequest language) {
        this.language = language;
        return this;
    }

    public AccountRegionalSettingRequest greetingLanguage(AccountGreetingLanguageInfoRequest greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public AccountRegionalSettingRequest formattingLocale(AccountFormattingLocaleInfoRequest formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

    public AccountRegionalSettingRequest timeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
}
