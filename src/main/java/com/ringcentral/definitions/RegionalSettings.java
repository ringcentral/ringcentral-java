package com.ringcentral.definitions;


// Regional data (timezone, home country, language) of an extension/account. The default is Company (Auto-Receptionist) settings
public class RegionalSettings {
    /**
     *
     */
    public CountryInfo homeCountry;
    /**
     *
     */
    public TimezoneInfo timezone;
    /**
     *
     */
    public LanguageInfo language;
    /**
     *
     */
    public GreetingLanguageInfo greetingLanguage;
    /**
     *
     */
    public FormattingLocaleInfo formattingLocale;
    /**
     * Time format setting. The default value is '12h' = ['12h', '24h']
     * Enum: 12h, 24h
     */
    public String timeFormat;

    public RegionalSettings homeCountry(CountryInfo homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public RegionalSettings timezone(TimezoneInfo timezone) {
        this.timezone = timezone;
        return this;
    }

    public RegionalSettings language(LanguageInfo language) {
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
