package com.ringcentral.definitions;

public class AdgPhoneNumberResource {
    /** Example: +1 (205) 6812029 */
    public String formattedPhoneNumber;

    public AdgPhoneNumberResource formattedPhoneNumber(String formattedPhoneNumber) {
        this.formattedPhoneNumber = formattedPhoneNumber;
        return this;
    }

    /** Example: +12056812029 */
    public String phoneNumber;

    public AdgPhoneNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /** Example: VoiceFax */
    public String type;

    public AdgPhoneNumberResource type(String type) {
        this.type = type;
        return this;
    }

    /** Custom user name of a phone number, if any Example: Boss */
    public String label;

    public AdgPhoneNumberResource label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Usage type of phone number Example: DirectNumber Enum: MobileNumber, ContactNumber,
     * DirectNumber, ForwardedNumber, PartnerBusinessMobileNumber
     */
    public String usageType;

    public AdgPhoneNumberResource usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    /** Specifies if a phone number should be hidden or not */
    public Boolean hidden;

    public AdgPhoneNumberResource hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * Specifies if the number is primary, i.e. displayed as &#039;main number&#039; and called by
     * default
     */
    public Boolean primary;

    public AdgPhoneNumberResource primary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /** Phone number in E.164 format Example: +12056812029 */
    public String e164;

    public AdgPhoneNumberResource e164(String e164) {
        this.e164 = e164;
        return this;
    }

    /** Formatted phone number Example: +1 (205) 681-2029 */
    public String formatted;

    public AdgPhoneNumberResource formatted(String formatted) {
        this.formatted = formatted;
        return this;
    }

    /**
     * SMS availability status of a phone number Enum: Active, Inactive, Disabled, Banned,
     * Suspended, Deprovisioning, InboundOnly, Unknown
     */
    public String smsAvailabilityStatus;

    public AdgPhoneNumberResource smsAvailabilityStatus(String smsAvailabilityStatus) {
        this.smsAvailabilityStatus = smsAvailabilityStatus;
        return this;
    }

    /** SMS campaign identifier */
    public String smsCampaignId;

    public AdgPhoneNumberResource smsCampaignId(String smsCampaignId) {
        this.smsCampaignId = smsCampaignId;
        return this;
    }
}
