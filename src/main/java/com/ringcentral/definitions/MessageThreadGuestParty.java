package com.ringcentral.definitions;

public class MessageThreadGuestParty {
    /** Phone number in e.164 format (with &#039;+&#039; prefix) Example: +16501234567 */
    public String phoneNumber;

    public MessageThreadGuestParty phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
