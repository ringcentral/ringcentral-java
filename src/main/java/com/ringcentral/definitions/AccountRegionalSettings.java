package com.ringcentral.definitions;


public class AccountRegionalSettings {
    /**
     * Extension country information
     */
    public CountryInfo homeCountry;
    /**
     * Extension timezone information
     */
    public TimezoneInfo timezone;
    /**
     * User interface language data
     */
    public LanguageInfo language;
    /**
     * Information on language used for telephony greetings
     */
    public GreetingLanguageInfo greetingLanguage;
    /**
     * Formatting language preferences for numbers, dates and currencies
     */
    public FormattingLocaleInfo formattingLocale;
    /**
     * Time format setting. The default value is '12h' = ['12h', '24h']
     * Enum: 12h, 24h
     */
    public String timeFormat;
    /**
     * Currency information
     */
    public CurrencyInfo currency;

    public AccountRegionalSettings homeCountry(CountryInfo homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public AccountRegionalSettings timezone(TimezoneInfo timezone) {
        this.timezone = timezone;
        return this;
    }

    public AccountRegionalSettings language(LanguageInfo language) {
        this.language = language;
        return this;
    }

    public AccountRegionalSettings greetingLanguage(GreetingLanguageInfo greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public AccountRegionalSettings formattingLocale(FormattingLocaleInfo formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

    public AccountRegionalSettings timeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    public AccountRegionalSettings currency(CurrencyInfo currency) {
        this.currency = currency;
        return this;
    }

}
