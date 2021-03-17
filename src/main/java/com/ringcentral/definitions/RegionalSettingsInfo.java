package com.ringcentral.definitions;


public class RegionalSettingsInfo
{
    /**
         */
        public TimezoneResource timezone;
  public RegionalSettingsInfo timezone(TimezoneResource timezone)
  {
    this.timezone = timezone;
    return this;
  }
  

        /**
         */
        public CountryResource homeCountry;
  public RegionalSettingsInfo homeCountry(CountryResource homeCountry)
  {
    this.homeCountry = homeCountry;
    return this;
  }
  

        /**
         */
        public LanguageResource language;
  public RegionalSettingsInfo language(LanguageResource language)
  {
    this.language = language;
    return this;
  }
  

        /**
         */
        public LanguageResource greetingLanguage;
  public RegionalSettingsInfo greetingLanguage(LanguageResource greetingLanguage)
  {
    this.greetingLanguage = greetingLanguage;
    return this;
  }
  

        /**
         */
        public LanguageResource formattingLocale;
  public RegionalSettingsInfo formattingLocale(LanguageResource formattingLocale)
  {
    this.formattingLocale = formattingLocale;
    return this;
  }
  
}
