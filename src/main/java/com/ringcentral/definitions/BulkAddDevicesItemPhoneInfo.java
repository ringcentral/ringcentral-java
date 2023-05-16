package com.ringcentral.definitions;


public class BulkAddDevicesItemPhoneInfo {
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

    public BulkAddDevicesItemPhoneInfo tollType(String tollType) {
        this.tollType = tollType;
        return this;
    }

    public BulkAddDevicesItemPhoneInfo preferredAreaCode(String preferredAreaCode) {
        this.preferredAreaCode = preferredAreaCode;
        return this;
    }

    public BulkAddDevicesItemPhoneInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public BulkAddDevicesItemPhoneInfo reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    public BulkAddDevicesItemPhoneInfo phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
}
