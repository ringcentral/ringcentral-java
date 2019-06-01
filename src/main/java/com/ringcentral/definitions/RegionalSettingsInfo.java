package com.ringcentral.definitions;


public class RegionalSettingsInfo {
    /**
     *
     */
    public TimezoneResource timezone;
    /**
     *
     */
    public CountryResource homeCountry;
    /**
     *
     */
    public LanguageResource language;
    /**
     *
     */
    public LanguageResource greetingLanguage;
    /**
     *
     */
    public LanguageResource formattingLocale;

    public RegionalSettingsInfo timezone(TimezoneResource timezone) {
        this.timezone = timezone;
        return this;
    }

    public RegionalSettingsInfo homeCountry(CountryResource homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public RegionalSettingsInfo language(LanguageResource language) {
        this.language = language;
        return this;
    }

    public RegionalSettingsInfo greetingLanguage(LanguageResource greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public RegionalSettingsInfo formattingLocale(LanguageResource formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

}
