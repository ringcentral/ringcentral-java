package com.ringcentral.definitions;


public class ExtensionUpdateRequest {
    /**
     * Enum: Disabled, Enabled, NotActivated
     */
    public String status;
    /**
     *
     */
    public ExtensionStatusInfo statusInfo;
    /**
     * Type of suspension
     */
    public String reason;
    /**
     * Free Form user comment
     */
    public String comment;
    /**
     * Extension number available
     */
    public String extensionNumber;
    /**
     *
     */
    public ContactInfoUpdateRequest contact;
    /**
     *
     */
    public ExtensionRegionalSettingRequest regionalSettings;
    /**
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;
    /**
     * Extension partner identifier
     */
    public String partnerId;
    /**
     * IVR PIN
     */
    public String ivrPin;
    /**
     * Password for extension
     */
    public String password;
    /**
     * For Department extension type only. Call queue settings
     */
    public CallQueueInfoRequest callQueueInfo;
    /**
     *
     */
    public UserTransitionInfo[] transition;

    public ExtensionUpdateRequest status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionUpdateRequest statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public ExtensionUpdateRequest reason(String reason) {
        this.reason = reason;
        return this;
    }

    public ExtensionUpdateRequest comment(String comment) {
        this.comment = comment;
        return this;
    }

    public ExtensionUpdateRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionUpdateRequest contact(ContactInfoUpdateRequest contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionUpdateRequest regionalSettings(ExtensionRegionalSettingRequest regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionUpdateRequest setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionUpdateRequest partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public ExtensionUpdateRequest ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }

    public ExtensionUpdateRequest password(String password) {
        this.password = password;
        return this;
    }

    public ExtensionUpdateRequest callQueueInfo(CallQueueInfoRequest callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }

    public ExtensionUpdateRequest transition(UserTransitionInfo[] transition) {
        this.transition = transition;
        return this;
    }

}
