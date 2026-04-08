package com.ringcentral.definitions;


    /**
* Direct number assignment in case the number pool is not supported
*/
public class PhoneNumberDefinitionDirectNumberWithReservationId
{
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String phoneNumber;
    public PhoneNumberDefinitionDirectNumberWithReservationId phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Phone number reservation ID. If provided, phoneNumber is also required
     */
    public String reservationId;
    public PhoneNumberDefinitionDirectNumberWithReservationId reservationId(String reservationId)
    {
        this.reservationId = reservationId;
        return this;
    }
}