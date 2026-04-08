package com.ringcentral.definitions;

public class AccountGreetingLanguageInfoRequest {
    /** Internal identifier of a greeting language Required */
    public String id;

    public AccountGreetingLanguageInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    /** Localization code of a greeting language Required */
    public String localeCode;

    public AccountGreetingLanguageInfoRequest localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
}
