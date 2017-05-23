package com.ringcentral.definitions;

public class ExtensionInfo_Request_ContactInfo_RegionalSettings {
    // Timezone data
    public ExtensionInfo_Request_ContactInfo_RegionalSettings_Timezone timezone;
    // User interface language data
    public ExtensionInfo_Request_ContactInfo_RegionalSettings_Language language;
    // Information on language used for telephony greetings
    public ExtensionInfo_Request_ContactInfo_RegionalSettings_GreetingLanguage greetingLanguage;
    // Formatting language preferences for numbers, dates and currencies
    public ExtensionInfo_Request_ContactInfo_RegionalSettings_FormattingLocale formattingLocale;

    public ExtensionInfo_Request_ContactInfo_RegionalSettings timezone(ExtensionInfo_Request_ContactInfo_RegionalSettings_Timezone timezone) {
        this.timezone = timezone;
        return this;
    }

    public ExtensionInfo_Request_ContactInfo_RegionalSettings language(ExtensionInfo_Request_ContactInfo_RegionalSettings_Language language) {
        this.language = language;
        return this;
    }

    public ExtensionInfo_Request_ContactInfo_RegionalSettings greetingLanguage(ExtensionInfo_Request_ContactInfo_RegionalSettings_GreetingLanguage greetingLanguage) {
        this.greetingLanguage = greetingLanguage;
        return this;
    }

    public ExtensionInfo_Request_ContactInfo_RegionalSettings formattingLocale(ExtensionInfo_Request_ContactInfo_RegionalSettings_FormattingLocale formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }
}
