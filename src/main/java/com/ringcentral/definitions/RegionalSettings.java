package com.ringcentral.definitions;

public class RegionalSettings {
    // Extension country information
    public CountryInfo homeCountry;
    // Extension timezone information
    public TimezoneInfo timezone;
    // User interface language data
    public LanguageInfo language;
    // Information on language used for telephony greetings
    public GreetingLanguageInfo greetingLanguage;
    // Formatting language preferences for numbers, dates and currencies
    public FormattingLocaleInfo formattingLocale;

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
}
