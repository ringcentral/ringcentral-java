package com.ringcentral.definitions;


public class RegSessionModel {
    /**
     * ID of the session
     * Required
     * Example: 123456789
     */
    public String id;
    /**
     * Status of the registration
     * Required
     * Example: Open
     * Enum: Open, Closed
     */
    public String registrationStatus;
    /**
     * The URI of the registration landing page
     * Format: uri
     * Example: https://abcde12345.webinar.ringcentral.com/register
     */
    public String registrationPageUri;
    /**
     * The URI of the branding descriptor
     * Format: uri
     * Example: https://abcde12345.webinar.ringcentral.com/branding
     */
    public String brandingDescriptorUri;
    /**
     * The current number of registrants
     * Required
     * Format: int32
     * Example: 10
     */
    public Long registrantCount;
    /**
     * Indicates that there are non-test registrants
     * Required
     * Example: true
     */
    public Boolean hasRealRegistrants;
    /**
     * Sequence number for iCalendar email attachments
     * Format: int32
     */
    public Long icalendarSequence;
    /**
     *
     */
    public RegSessionModelSettings settings;

    public RegSessionModel id(String id) {
        this.id = id;
        return this;
    }

    public RegSessionModel registrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    public RegSessionModel registrationPageUri(String registrationPageUri) {
        this.registrationPageUri = registrationPageUri;
        return this;
    }

    public RegSessionModel brandingDescriptorUri(String brandingDescriptorUri) {
        this.brandingDescriptorUri = brandingDescriptorUri;
        return this;
    }

    public RegSessionModel registrantCount(Long registrantCount) {
        this.registrantCount = registrantCount;
        return this;
    }

    public RegSessionModel hasRealRegistrants(Boolean hasRealRegistrants) {
        this.hasRealRegistrants = hasRealRegistrants;
        return this;
    }

    public RegSessionModel icalendarSequence(Long icalendarSequence) {
        this.icalendarSequence = icalendarSequence;
        return this;
    }

    public RegSessionModel settings(RegSessionModelSettings settings) {
        this.settings = settings;
        return this;
    }
}
