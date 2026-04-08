package com.ringcentral.definitions;


public class RegSessionModelSettings
{
    /**
     * The maximum number of registrants which forces closing the registration (0 means &quot;off&quot;).
     * Format: int32
     */
    public Long autoCloseLimit;
    public RegSessionModelSettings autoCloseLimit(Long autoCloseLimit)
    {
        this.autoCloseLimit = autoCloseLimit;
        return this;
    }

    /**
     * Indicates that emails to registrants should be suppressed (should be supported by external party)
     */
    public Boolean suppressEmails;
    public RegSessionModelSettings suppressEmails(Boolean suppressEmails)
    {
        this.suppressEmails = suppressEmails;
        return this;
    }

    /**
     * Indicates that registration digest should be sent to host.
     * Default: true
     */
    public Boolean registrationDigestEnabled;
    public RegSessionModelSettings registrationDigestEnabled(Boolean registrationDigestEnabled)
    {
        this.registrationDigestEnabled = registrationDigestEnabled;
        return this;
    }

    /**
     * Indicates that registrants are allowed to join from multiple devices.
     */
    public Boolean preventMultipleDeviceJoins;
    public RegSessionModelSettings preventMultipleDeviceJoins(Boolean preventMultipleDeviceJoins)
    {
        this.preventMultipleDeviceJoins = preventMultipleDeviceJoins;
        return this;
    }

    /**
     * Indicates that work email address is required for registration.
     */
    public Boolean workEmailRequired;
    public RegSessionModelSettings workEmailRequired(Boolean workEmailRequired)
    {
        this.workEmailRequired = workEmailRequired;
        return this;
    }

    /**
     * Indicates that recording will be included in emails.
     */
    public Boolean viewRecording;
    public RegSessionModelSettings viewRecording(Boolean viewRecording)
    {
        this.viewRecording = viewRecording;
        return this;
    }

    /**
     * Duration of on-demand webinar. The default value can only be used if the session is on demand.
     * Default: SixMonths
     * Enum: OneMonth, TwoMonths, ThreeMonths, SixMonths, OneYear
     */
    public String onDemandDuration;
    public RegSessionModelSettings onDemandDuration(String onDemandDuration)
    {
        this.onDemandDuration = onDemandDuration;
        return this;
    }

    /**
     * Indicates that recording exists for the session.
     */
    public Boolean recordingExist;
    public RegSessionModelSettings recordingExist(Boolean recordingExist)
    {
        this.recordingExist = recordingExist;
        return this;
    }

    /**
     * Indicates that post webinar registration will be opened automatically when webinar ends.
     */
    public Boolean autoOpenPostWebinarRegistration;
    public RegSessionModelSettings autoOpenPostWebinarRegistration(Boolean autoOpenPostWebinarRegistration)
    {
        this.autoOpenPostWebinarRegistration = autoOpenPostWebinarRegistration;
        return this;
    }

    /**
     * The time after which the post webinar will be closed automatically.
     * Format: date-time
     */
    public String postWebinarRegistrationClosingTime;
    public RegSessionModelSettings postWebinarRegistrationClosingTime(String postWebinarRegistrationClosingTime)
    {
        this.postWebinarRegistrationClosingTime = postWebinarRegistrationClosingTime;
        return this;
    }
}