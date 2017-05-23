package com.ringcentral.definitions;

public class ExtensionInfo_Request_Provision_ContactInfo {
    // Mandatory. Extension user first name
    public String firstName;
    // Mandatory. Extension user last name
    public String lastName;
    // Mandatory. Extension user contact email
    public String email;

    public ExtensionInfo_Request_Provision_ContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ExtensionInfo_Request_Provision_ContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ExtensionInfo_Request_Provision_ContactInfo email(String email) {
        this.email = email;
        return this;
    }
}
