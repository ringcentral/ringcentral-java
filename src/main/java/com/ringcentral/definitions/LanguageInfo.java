package com.ringcentral.definitions;


    /**
* User interface language data
*/
public class LanguageInfo
{
    /**
     * Internal identifier of a language
     */
    public String id;
    public LanguageInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a language
     * Format: uri
     */
    public String uri;
    public LanguageInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Indicates whether a language is available as
    * greeting language
     */
    public Boolean greeting;
    public LanguageInfo greeting(Boolean greeting)
    {
        this.greeting = greeting;
        return this;
    }

    /**
     * Indicates whether a language is available as
    * formatting locale
     */
    public Boolean formattingLocale;
    public LanguageInfo formattingLocale(Boolean formattingLocale)
    {
        this.formattingLocale = formattingLocale;
        return this;
    }

    /**
     * Localization code of a language
     */
    public String localeCode;
    public LanguageInfo localeCode(String localeCode)
    {
        this.localeCode = localeCode;
        return this;
    }

    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String isoCode;
    public LanguageInfo isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Official name of a language
     */
    public String name;
    public LanguageInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Indicates whether a language is available as UI language
     */
    public Boolean ui;
    public LanguageInfo ui(Boolean ui)
    {
        this.ui = ui;
        return this;
    }

    /**
     * Time format
     */
    public String timeFormat;
    public LanguageInfo timeFormat(String timeFormat)
    {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * Date format
     */
    public String dateFormat;
    public LanguageInfo dateFormat(String dateFormat)
    {
        this.dateFormat = dateFormat;
        return this;
    }
}