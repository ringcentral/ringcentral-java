package com.ringcentral.definitions;

public class RegSessionModel {
    /** ID of the session Required Example: 123456789 */
    public String id;

    public RegSessionModel id(String id) {
        this.id = id;
        return this;
    }

    /** Status of the registration Required Example: Open Enum: Open, Closed */
    public String registrationStatus;

    public RegSessionModel registrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * The URI of the registration landing page Format: uri Example:
     * https://abcde12345.webinar.ringcentral.com/register
     */
    public String registrationPageUri;

    public RegSessionModel registrationPageUri(String registrationPageUri) {
        this.registrationPageUri = registrationPageUri;
        return this;
    }

    /**
     * The URI of the branding descriptor Format: uri Example:
     * https://abcde12345.webinar.ringcentral.com/branding
     */
    public String brandingDescriptorUri;

    public RegSessionModel brandingDescriptorUri(String brandingDescriptorUri) {
        this.brandingDescriptorUri = brandingDescriptorUri;
        return this;
    }

    /** The current number of registrants Required Format: int32 Example: 10 */
    public Long registrantCount;

    public RegSessionModel registrantCount(Long registrantCount) {
        this.registrantCount = registrantCount;
        return this;
    }

    /** The current number of post webinar registrants Format: int32 Example: 10 */
    public Long postWebinarRegistrantCount;

    public RegSessionModel postWebinarRegistrantCount(Long postWebinarRegistrantCount) {
        this.postWebinarRegistrantCount = postWebinarRegistrantCount;
        return this;
    }

    /** Indicates that there are non-test registrants Required Example: true */
    public Boolean hasRealRegistrants;

    public RegSessionModel hasRealRegistrants(Boolean hasRealRegistrants) {
        this.hasRealRegistrants = hasRealRegistrants;
        return this;
    }

    /** Sequence number for iCalendar email attachments Format: int32 */
    public Long icalendarSequence;

    public RegSessionModel icalendarSequence(Long icalendarSequence) {
        this.icalendarSequence = icalendarSequence;
        return this;
    }

    /** */
    public RegSessionModelSettings settings;

    public RegSessionModel settings(RegSessionModelSettings settings) {
        this.settings = settings;
        return this;
    }
}
