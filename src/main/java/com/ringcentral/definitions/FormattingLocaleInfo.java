package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FormattingLocaleInfo
{
    // Internal identifier of a formatting language
    public String id;
    public FormattingLocaleInfo id(String id) {
        this.id = id;
        return this;
    }
    // Localization code of a formatting language
    public String localeCode;
    public FormattingLocaleInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
    //
    public String name;
    public FormattingLocaleInfo name(String name) {
        this.name = name;
        return this;
    }
}
