package com.ringcentral.definitions;


/**
 * Regional data (timezone, home country, language) of an extension.
 * The default is Company (Auto-Receptionist) settings
 */
public class ExtensionRegionalSettingRequest {
    /**
     *
     */
    public ExtensionCountryInfoRequest homeCountry;
    /**
     *
     */
    public ExtensionTimezoneInfoRequest timezone;
    /**
     *
     */
    public ExtensionLanguageInfoRequest language;
    /**
     *
     */
    public ExtensionGreetingLanguageInfoRequest greetingLanguage;
    /**
     *
     */
    public ExtensionFormattingLocaleInfoRequest formattingLocale;
    /**
     *
     */
    public ExtensionCurrencyInfoRequest currency;
    /**
     * Time format (12-hours or 24-hours).
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;

    public ExtensionRegionalSettingRequest homeCountry(ExtensionCountryInfoRequest homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public ExtensionRegionalSettingRequest timezone(ExtensionTimezoneInfoRequest timezone) {
        this.timezone = timezone;
        return this;
    }

    public ExtensionRegionalSettingRequest language(ExtensionLanguageInfoRequest language) {
        this.language = language;
        return this;
    }

    public ExtensionRegionalSettingRequest greetingLanguage(ExtensionGreetingLanguageInfoRequest greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public ExtensionRegionalSettingRequest formattingLocale(ExtensionFormattingLocaleInfoRequest formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

    public ExtensionRegionalSettingRequest currency(ExtensionCurrencyInfoRequest currency) {
        this.currency = currency;
        return this;
    }

    public ExtensionRegionalSettingRequest timeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
}
