package com.ringcentral.definitions;


public class PhoneNumberResource {
    /**
     *
     */
    public String formattedPhoneNumber;
    /**
     *
     */
    public String phoneNumber;
    /**
     *
     */
    public String type;
    /**
     * Custom user name of a phone number, if any
     */
    public String label;
    /**
     * Usage type of a phone number
     * Enum: MobileNumber, ContactNumber, DirectNumber, ForwardedNumber
     */
    public String usageType;

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

}
