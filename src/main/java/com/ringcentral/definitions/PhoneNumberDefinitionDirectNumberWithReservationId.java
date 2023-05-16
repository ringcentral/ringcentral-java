package com.ringcentral.definitions;


/**
 * To be used for direct number assignment in case number pool is not supported
 */
public class PhoneNumberDefinitionDirectNumberWithReservationId {
    /**
     * Phone number ID
     * Required
     */
    public String phoneNumber;
    /**
     * Phone number reservation ID
     */
    public String reservationId;

    public PhoneNumberDefinitionDirectNumberWithReservationId phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberDefinitionDirectNumberWithReservationId reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
}
