package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionCreationRequest
{
    // Contact Information
    public ContactInfoUpdateRequest contact;
    public ExtensionCreationRequest contact(ContactInfoUpdateRequest contact) {
        this.contact = contact;
        return this;
    }
    // Number of extension
    public String extensionNumber;
    public ExtensionCreationRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Password for extension. If not specified, the password is auto-generated
    public String password;
    public ExtensionCreationRequest password(String password) {
        this.password = password;
        return this;
    }
    // List of non-RC internal identifiers assigned to an extension
    public ReferenceInfo[] references;
    public ExtensionCreationRequest references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }
    // Extension region data (timezone, home country, language)
    public RegionalSettings regionalSettings;
    public ExtensionCreationRequest regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    // Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted' = ['NotStarted', 'Incomplete', 'Completed']
    public String setupWizardState;
    public ExtensionCreationRequest setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    // Extension current state = ['Enabled', 'Disabled', 'NotActivated', 'Unassigned']
    public String status;
    public ExtensionCreationRequest status(String status) {
        this.status = status;
        return this;
    }
    // Status information (reason, comment). For 'Disabled' status only
    public ExtensionStatusInfo statusInfo;
    public ExtensionCreationRequest statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    // Extension type = ['User', 'VirtualUser', 'DigitalUser', 'Department']
    public String type;
    public ExtensionCreationRequest type(String type) {
        this.type = type;
        return this;
    }
}
