package com.ringcentral.definitions;


public class TransitionInfo {
    /**
     * Specifies if a welcome/activation email is sent to the new users
     * (with the extension status transition from &#039;Unassigned&#039; to &#039;NotActivated/Disabled&#039;)
     * Default: true
     */
    public Boolean sendWelcomeEmail;
    /**
     *
     */
    public ExtensionRegionalSettingRequest regionalSettings;

    public TransitionInfo sendWelcomeEmail(Boolean sendWelcomeEmail) {
        this.sendWelcomeEmail = sendWelcomeEmail;
        return this;
    }

    public TransitionInfo regionalSettings(ExtensionRegionalSettingRequest regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
}
