package com.ringcentral.definitions;


// Account level region data (web service Auto-Receptionist settings)
public class AccountRegionalSettings {
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
    /**
     *
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
