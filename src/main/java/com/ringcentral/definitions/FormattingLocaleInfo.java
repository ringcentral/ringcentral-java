package com.ringcentral.definitions;

public class FormattingLocaleInfo {
    // Internal identifier of a formatting language
    public String id;
    // Localization code of a formatting language
    public String localeCode;
    // Official name of a formatting language
    public String name;

    public FormattingLocaleInfo id(String id) {
        this.id = id;
        return this;
    }

    public FormattingLocaleInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    public FormattingLocaleInfo name(String name) {
        this.name = name;
        return this;
    }
}
