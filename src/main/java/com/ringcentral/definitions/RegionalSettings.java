package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RegionalSettings
{
    // Extension country information
    public CountryInfo homeCountry;
    public RegionalSettings homeCountry(CountryInfo homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
    // Extension timezone information
    public TimezoneInfo timezone;
    public RegionalSettings timezone(TimezoneInfo timezone) {
        this.timezone = timezone;
        return this;
    }
    // User interface language data
    public LanguageInfo language;
    public RegionalSettings language(LanguageInfo language) {
        this.language = language;
        return this;
    }
    // Information on language used for telephony greetings
    public GreetingLanguageInfo greetingLanguage;
    public RegionalSettings greetingLanguage(GreetingLanguageInfo greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }
    // Formatting language preferences for numbers, dates and currencies
    public FormattingLocaleInfo formattingLocale;
    public RegionalSettings formattingLocale(FormattingLocaleInfo formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }
    // Time format setting. The default value is '12h' = ['12h', '24h']
    public String timeFormat;
    public RegionalSettings timeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
}
