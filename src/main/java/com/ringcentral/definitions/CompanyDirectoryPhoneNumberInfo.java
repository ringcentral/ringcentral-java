package com.ringcentral.definitions;


// Extension phone number information
public class CompanyDirectoryPhoneNumberInfo {
    /**
     * Extension phone number in E.164 format
     */
    public String phoneNumber;
    /**
     * Type of a phone number
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;
    /**
     * Specifies if a phone number should be hidden or not. Returned only if the value is &#039;True&#039;
     */
    public Boolean hidden;
    /**
     * Usage type of a phone number
     * Enum: MobileNumber, ContactNumber, DirectNumber, ForwardedNumber
     */
    public String usageType;

    public CompanyDirectoryPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CompanyDirectoryPhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

    public CompanyDirectoryPhoneNumberInfo hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public CompanyDirectoryPhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
