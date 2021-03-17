package com.ringcentral.definitions;


    // Regional data (timezone, home country, language) of an extension/account. The default is Company (Auto-Receptionist) settings
public class RegionalSettings
{
    /**
         */
        public CountryInfo homeCountry;
  public RegionalSettings homeCountry(CountryInfo homeCountry)
  {
    this.homeCountry = homeCountry;
    return this;
  }
  

        /**
         */
        public TimezoneInfo timezone;
  public RegionalSettings timezone(TimezoneInfo timezone)
  {
    this.timezone = timezone;
    return this;
  }
  

        /**
         */
        public LanguageInfo language;
  public RegionalSettings language(LanguageInfo language)
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
         * Time format setting. The default value is '12h' = ['12h', '24h']
         * Enum: 12h, 24h
         */
        public String timeFormat;
  public RegionalSettings timeFormat(String timeFormat)
  {
    this.timeFormat = timeFormat;
    return this;
  }
  
}
