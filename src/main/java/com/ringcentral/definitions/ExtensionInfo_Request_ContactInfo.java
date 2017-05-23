package com.ringcentral.definitions;

public class ExtensionInfo_Request_ContactInfo {
    // Contact information
    public ContactInfo contact;
    // Region data (timezone, home country, language)
    public ExtensionInfo_Request_ContactInfo_RegionalSettings regionalSettings;
    // Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'
    public String setupWizardState;
    // Extension user department
    public String department;

    public ExtensionInfo_Request_ContactInfo contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionInfo_Request_ContactInfo regionalSettings(ExtensionInfo_Request_ContactInfo_RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionInfo_Request_ContactInfo setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionInfo_Request_ContactInfo department(String department) {
        this.department = department;
        return this;
    }
}
