package com.ringcentral.definitions;


    /**
* Regional data (timezone, home country, language) of an extension/account.
* The default is Company (Auto-Receptionist) settings
* 
*/
public class RegionalSettings
{
    /**
     */
    public CountryInfoShortModel homeCountry;
    public RegionalSettings homeCountry(CountryInfoShortModel homeCountry)
    {
        this.homeCountry = homeCountry;
        return this;
    }

    /**
     */
    public TimezoneInfoBase timezone;
    public RegionalSettings timezone(TimezoneInfoBase timezone)
    {
        this.timezone = timezone;
        return this;
    }

    /**
     */
    public RegionalLanguageInfo language;
    public RegionalSettings language(RegionalLanguageInfo language)
    {
        this.language = language;
        return this;
    }

    /**
     */
    public GreetingLanguageInfo greetingLanguage;
    public RegionalSettings greetingLanguage(GreetingLanguageInfo greetingLanguage)
    {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    /**
     */
    public FormattingLocaleInfo formattingLocale;
    public RegionalSettings formattingLocale(FormattingLocaleInfo formattingLocale)
    {
        this.formattingLocale = formattingLocale;
        return this;
    }

    /**
     * Time format (12-hours or 24-hours).
     * Default: 12h
     * Enum: 12h, 24h
     */
    public String timeFormat;
    public RegionalSettings timeFormat(String timeFormat)
    {
        this.timeFormat = timeFormat;
        return this;
    }
}