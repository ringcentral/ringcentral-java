package com.ringcentral.definitions;


/**
 * Regional data (timezone, home country, language) of an extension/account.
 * The default is Company (Auto-Receptionist) settings
 */
public class AccountRegionalSettings {
    /**
     *
     */
    public CountryInfoShortModel homeCountry;
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
    /**
     *
     */
    public CurrencyInfo currency;

    public AccountRegionalSettings homeCountry(CountryInfoShortModel homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public AccountRegionalSettings timezone(TimezoneInfoBase timezone) {
        this.timezone = timezone;
        return this;
    }

    public AccountRegionalSettings language(RegionalLanguageInfo language) {
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
