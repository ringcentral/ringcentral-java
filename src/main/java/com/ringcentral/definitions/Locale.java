package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Locale
{
    //
    public String language;
    public Locale language(String language) {
        this.language = language;
        return this;
    }
    //
    public String country;
    public Locale country(String country) {
        this.country = country;
        return this;
    }
    //
    public String displayCountry;
    public Locale displayCountry(String displayCountry) {
        this.displayCountry = displayCountry;
        return this;
    }
    //
    public String displayLanguage;
    public Locale displayLanguage(String displayLanguage) {
        this.displayLanguage = displayLanguage;
        return this;
    }
    //
    public String displayName;
    public Locale displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    //
    public String displayScript;
    public Locale displayScript(String displayScript) {
        this.displayScript = displayScript;
        return this;
    }
    //
    public String displayVariant;
    public Locale displayVariant(String displayVariant) {
        this.displayVariant = displayVariant;
        return this;
    }
    //
    public String[] extensionKeys;
    public Locale extensionKeys(String[] extensionKeys) {
        this.extensionKeys = extensionKeys;
        return this;
    }
    //
    public String iso3Country;
    public Locale iso3Country(String iso3Country) {
        this.iso3Country = iso3Country;
        return this;
    }
    //
    public String iso3Language;
    public Locale iso3Language(String iso3Language) {
        this.iso3Language = iso3Language;
        return this;
    }
    //
    public String script;
    public Locale script(String script) {
        this.script = script;
        return this;
    }
    //
    public String[] unicodeLocaleAttributes;
    public Locale unicodeLocaleAttributes(String[] unicodeLocaleAttributes) {
        this.unicodeLocaleAttributes = unicodeLocaleAttributes;
        return this;
    }
    //
    public String[] unicodeLocaleKeys;
    public Locale unicodeLocaleKeys(String[] unicodeLocaleKeys) {
        this.unicodeLocaleKeys = unicodeLocaleKeys;
        return this;
    }
    //
    public String variant;
    public Locale variant(String variant) {
        this.variant = variant;
        return this;
    }
}
