package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionUpdateRequest
{
    //
    public String status;
    public ExtensionUpdateRequest status(String status) {
        this.status = status;
        return this;
    }
    //
    public ExtensionStatusInfo statusInfo;
    public ExtensionUpdateRequest statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    // Type of suspension
    public String reason;
    public ExtensionUpdateRequest reason(String reason) {
        this.reason = reason;
        return this;
    }
    // Free Form user comment
    public String comment;
    public ExtensionUpdateRequest comment(String comment) {
        this.comment = comment;
        return this;
    }
    // Extension number available
    public String extensionNumber;
    public ExtensionUpdateRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public ContactInfoUpdateRequest contact;
    public ExtensionUpdateRequest contact(ContactInfoUpdateRequest contact) {
        this.contact = contact;
        return this;
    }
    //
    public ExtensionRegionalSettingRequest regionalSettings;
    public ExtensionUpdateRequest regionalSettings(ExtensionRegionalSettingRequest regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    //
    public String setupWizardState;
    public ExtensionUpdateRequest setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    //  Extension partner identifier
    public String partnerId;
    public ExtensionUpdateRequest partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    // IVR PIN
    public String ivrPin;
    public ExtensionUpdateRequest ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    // Password for extension
    public String password;
    public ExtensionUpdateRequest password(String password) {
        this.password = password;
        return this;
    }
    // For Department extension type only. Call queue settings
    public CallQueueInfoRequest callQueueInfo;
    public ExtensionUpdateRequest callQueueInfo(CallQueueInfoRequest callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }
    // For NotActivated extensions only. Welcome email setting
    public String transition;
    public ExtensionUpdateRequest transition(String transition) {
        this.transition = transition;
        return this;
    }
}
