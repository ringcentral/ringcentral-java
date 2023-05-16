package com.ringcentral.definitions;


public class DeviceDefinitionPhoneInfo {
    /**
     * Indicates if a number is toll or toll-free
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    /**
     * Preferred area code to use if numbers available
     * Example: 650
     */
    public String preferredAreaCode;
    /**
     * Phone number ID
     */
    public String phoneNumber;
    /**
     * Phone number reservation ID
     */
    public String reservationId;
    /**
     * Phone number ID
     */
    public String phoneNumberId;

    public DeviceDefinitionPhoneInfo tollType(String tollType) {
        this.tollType = tollType;
        return this;
    }

    public DeviceDefinitionPhoneInfo preferredAreaCode(String preferredAreaCode) {
        this.preferredAreaCode = preferredAreaCode;
        return this;
    }

    public DeviceDefinitionPhoneInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public DeviceDefinitionPhoneInfo reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    public DeviceDefinitionPhoneInfo phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
}
