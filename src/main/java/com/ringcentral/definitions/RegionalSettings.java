package com.ringcentral.definitions;


/**
 * Regional data (timezone, home country, language) of an extension/account. The default is Company (Auto-Receptionist) settings
 */
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
     * Time format setting. The default value is &#039;12h&#039; = [&#039;12h&#039;, &#039;24h&#039;]
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
