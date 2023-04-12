package com.ringcentral.definitions;


public class RegSessionModelSettings {
    /**
     * The maximum number of registrants which forces closing the registration (0 means &quot;off&quot;).
     * Format: int32
     */
    public Long autoCloseLimit;
    /**
     * Indicates that emails to registrants should be suppressed (should be supported by external party)
     */
    public Boolean suppressEmails;
    /**
     * Indicates that registration digest should be sent to host.
     * Default: true
     */
    public Boolean registrationDigestEnabled;
    /**
     * Indicates that registrants are allowed to join from multiple devices.
     */
    public Boolean preventMultipleDeviceJoins;
    /**
     * Indicates that work email address is required for registration.
     */
    public Boolean workEmailRequired;

    public RegSessionModelSettings autoCloseLimit(Long autoCloseLimit) {
        this.autoCloseLimit = autoCloseLimit;
        return this;
    }

    public RegSessionModelSettings suppressEmails(Boolean suppressEmails) {
        this.suppressEmails = suppressEmails;
        return this;
    }

    public RegSessionModelSettings registrationDigestEnabled(Boolean registrationDigestEnabled) {
        this.registrationDigestEnabled = registrationDigestEnabled;
        return this;
    }

    public RegSessionModelSettings preventMultipleDeviceJoins(Boolean preventMultipleDeviceJoins) {
        this.preventMultipleDeviceJoins = preventMultipleDeviceJoins;
        return this;
    }

    public RegSessionModelSettings workEmailRequired(Boolean workEmailRequired) {
        this.workEmailRequired = workEmailRequired;
        return this;
    }
}
