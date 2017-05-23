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
}
