package com.ringcentral.definitions;


public class AccountFormattingLocaleInfoRequest {
    /**
     * Internal identifier of a formatting language
     * Required
     */
    public String id;
    /**
     * Localization code of a formatting language
     * Required
     */
    public String localeCode;

    public AccountFormattingLocaleInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public AccountFormattingLocaleInfoRequest localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
}
