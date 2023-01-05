package com.ringcentral.definitions;


    /**
* Account level region data (web service Auto-Receptionist settings)
* 
*/
public class AccountRegionalSettings
{
    /**
     */
    public CountryInfoShortModel homeCountry;
    public AccountRegionalSettings homeCountry(CountryInfoShortModel homeCountry)
    {
        this.homeCountry = homeCountry;
        return this;
    }

    /**
     */
    public TimezoneInfo timezone;
    public AccountRegionalSettings timezone(TimezoneInfo timezone)
    {
        this.timezone = timezone;
        return this;
    }

    /**
     */
    public RegionalLanguageInfo language;
    public AccountRegionalSettings language(RegionalLanguageInfo language)
    {
        this.language = language;
        return this;
    }

    /**
     */
    public GreetingLanguageInfo greetingLanguage;
    public AccountRegionalSettings greetingLanguage(GreetingLanguageInfo greetingLanguage)
    {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    /**
     */
    public FormattingLocaleInfo formattingLocale;
    public AccountRegionalSettings formattingLocale(FormattingLocaleInfo formattingLocale)
    {
        this.formattingLocale = formattingLocale;
        return this;
    }

    /**
     * Time format setting. The default value is &#039;12h&#039; = [&#039;12h&#039;, &#039;24h&#039;]
     * Enum: 12h, 24h
     */
    public String timeFormat;
    public AccountRegionalSettings timeFormat(String timeFormat)
    {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     */
    public CurrencyInfo currency;
    public AccountRegionalSettings currency(CurrencyInfo currency)
    {
        this.currency = currency;
        return this;
    }
}