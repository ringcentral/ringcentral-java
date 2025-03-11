package com.ringcentral.definitions;


public class PhoneNumberResource {
    /**
     * Example: +1 (205) 6812029
     */
    public String formattedPhoneNumber;
    /**
     * Example: +12056812029
     */
    public String phoneNumber;
    /**
     * Example: VoiceFax
     */
    public String type;
    /**
     * Custom user name of a phone number, if any
     * Example: Boss
     */
    public String label;
    /**
     * Usage type of phone number
     * Example: DirectNumber
     * Enum: MobileNumber, ContactNumber, DirectNumber, ForwardedNumber, PartnerBusinessMobileNumber
     */
    public String usageType;
    /**
     * Specifies if a phone number should be hidden or not
     */
    public Boolean hidden;
    /**
     * Specifies if the number is primary, i.e. displayed as &#039;main number&#039; and called by default
     */
    public Boolean primary;

    public PhoneNumberResource formattedPhoneNumber(String formattedPhoneNumber) {
        this.formattedPhoneNumber = formattedPhoneNumber;
        return this;
    }

    public PhoneNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberResource type(String type) {
        this.type = type;
        return this;
    }

    public PhoneNumberResource label(String label) {
        this.label = label;
        return this;
    }

    public PhoneNumberResource usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public PhoneNumberResource hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public PhoneNumberResource primary(Boolean primary) {
        this.primary = primary;
        return this;
    }
}
