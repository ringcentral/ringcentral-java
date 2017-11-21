package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RegionalSettingsResource
{
    //
    public TimezoneResource timezone;
    public RegionalSettingsResource timezone(TimezoneResource timezone) {
        this.timezone = timezone;
        return this;
    }
    //
    public CountryResource homeCountry;
    public RegionalSettingsResource homeCountry(CountryResource homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
    //
    public LanguageResource language;
    public RegionalSettingsResource language(LanguageResource language) {
        this.language = language;
        return this;
    }
    //
    public LanguageResource greetingLanguage;
    public RegionalSettingsResource greetingLanguage(LanguageResource greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }
    //
    public LanguageResource formattingLocale;
    public RegionalSettingsResource formattingLocale(LanguageResource formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }
}
