package com.ringcentral.definitions;


/**
 * Regional data (timezone, home country, language) of an extension/account.
 * The default is Company (Auto-Receptionist) settings
 */
public class RegionalSettings {
    /**
     *
     */
    public CountryInfoShortModelV2 homeCountry;
    /**
     *
     */
    public TimezoneInfoBase timezone;
    /**
     *
     */
    public RegionalLanguageInfo language;
    /**
     *
     */
    public GreetingLanguageInfo greetingLanguage;
    /**
     *
     */
    public FormattingLocaleInfo formattingLocale;
    /**
     * Time format (12-hours or 24-hours).
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;

    public RegionalSettings homeCountry(CountryInfoShortModelV2 homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public RegionalSettings timezone(TimezoneInfoBase timezone) {
        this.timezone = timezone;
        return this;
    }

    public RegionalSettings language(RegionalLanguageInfo language) {
        this.language = language;
        return this;
    }

    public RegionalSettings greetingLanguage(GreetingLanguageInfo greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public RegionalSettings formattingLocale(FormattingLocaleInfo formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

    public RegionalSettings timeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
}
