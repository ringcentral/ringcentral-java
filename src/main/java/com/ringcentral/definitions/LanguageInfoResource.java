package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LanguageInfoResource
{
    //
    public String uri;
    public LanguageInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public LanguageInfoResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public LanguageInfoResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String isoCode;
    public LanguageInfoResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    //
    public String localeCode;
    public LanguageInfoResource localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
    //
    public Boolean ui;
    public LanguageInfoResource ui(Boolean ui) {
        this.ui = ui;
        return this;
    }
    //
    public Boolean greeting;
    public LanguageInfoResource greeting(Boolean greeting) {
        this.greeting = greeting;
        return this;
    }
    //
    public Boolean formattingLocale;
    public LanguageInfoResource formattingLocale(Boolean formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }
}
