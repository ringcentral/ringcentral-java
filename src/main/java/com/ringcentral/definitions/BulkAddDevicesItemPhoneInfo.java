package com.ringcentral.definitions;


public class BulkAddDevicesItemPhoneInfo
{
    /**
     * Indicates if a number is toll or toll-free
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    public BulkAddDevicesItemPhoneInfo tollType(String tollType)
    {
        this.tollType = tollType;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    public BulkAddDevicesItemPhoneInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Preferred area code to use if the numbers are available
     * Example: 650
     */
    public String preferredAreaCode;
    public BulkAddDevicesItemPhoneInfo preferredAreaCode(String preferredAreaCode)
    {
        this.preferredAreaCode = preferredAreaCode;
        return this;
    }

    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String phoneNumber;
    public BulkAddDevicesItemPhoneInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Phone number reservation ID. If provided, phoneNumber is also required
     */
    public String reservationId;
    public BulkAddDevicesItemPhoneInfo reservationId(String reservationId)
    {
        this.reservationId = reservationId;
        return this;
    }

    /**
     * Phone number identifier
     */
    public String phoneNumberId;
    public BulkAddDevicesItemPhoneInfo phoneNumberId(String phoneNumberId)
    {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
}