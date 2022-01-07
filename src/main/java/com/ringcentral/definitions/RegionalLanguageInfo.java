package com.ringcentral.definitions;


// Information on a language set as regional
public class RegionalLanguageInfo {
    /**
     * Internal identifier of a language set as regional
     */
    public String id;
    /**
     * Localization code of a language set as regional
     */
    public String localeCode;
    /**
     * Official name of a language set as regional
     */
    public String name;

    public RegionalLanguageInfo id(String id) {
        this.id = id;
        return this;
    }

    public RegionalLanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    public RegionalLanguageInfo name(String name) {
        this.name = name;
        return this;
    }
}
