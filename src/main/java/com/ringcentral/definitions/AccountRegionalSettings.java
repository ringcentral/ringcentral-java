package com.ringcentral.definitions;


    // Account level region data (web service Auto-Receptionist settings)
public class AccountRegionalSettings
{
    /**
         */
        public CountryInfo homeCountry;
  public AccountRegionalSettings homeCountry(CountryInfo homeCountry)
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
        public LanguageInfo language;
  public AccountRegionalSettings language(LanguageInfo language)
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
         * Time format setting. The default value is '12h' = ['12h', '24h']
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
