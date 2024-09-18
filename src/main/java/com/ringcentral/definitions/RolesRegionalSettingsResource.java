package com.ringcentral.definitions;


public class RolesRegionalSettingsResource {
    /**
     *
     */
    public RolesTimezoneResource timezone;
    /**
     *
     */
    public RolesCountryResource homeCountry;
    /**
     *
     */
    public RolesLanguageResource language;
    /**
     *
     */
    public RolesLanguageResource greetingLanguage;
    /**
     *
     */
    public RolesLanguageResource formattingLocale;
    /**
     * Time format (12-hours or 24-hours).
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;
    /**
     *
     */
    public CurrencyResource currency;

    public RolesRegionalSettingsResource timezone(RolesTimezoneResource timezone) {
        this.timezone = timezone;
        return this;
    }

    public RolesRegionalSettingsResource homeCountry(RolesCountryResource homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public RolesRegionalSettingsResource language(RolesLanguageResource language) {
        this.language = language;
        return this;
    }

    public RolesRegionalSettingsResource greetingLanguage(RolesLanguageResource greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public RolesRegionalSettingsResource formattingLocale(RolesLanguageResource formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

    public RolesRegionalSettingsResource timeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    public RolesRegionalSettingsResource currency(CurrencyResource currency) {
        this.currency = currency;
        return this;
    }
}
