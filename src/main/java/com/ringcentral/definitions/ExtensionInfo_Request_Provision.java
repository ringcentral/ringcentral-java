package com.ringcentral.definitions;

public class ExtensionInfo_Request_Provision {
    // Mandatory. Resulting extension status
    public String status;
    // Mandatory. Extension user contact information
    public ExtensionInfo_Request_Provision_ContactInfo contact;

    public ExtensionInfo_Request_Provision status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionInfo_Request_Provision contact(ExtensionInfo_Request_Provision_ContactInfo contact) {
        this.contact = contact;
        return this;
    }
}
