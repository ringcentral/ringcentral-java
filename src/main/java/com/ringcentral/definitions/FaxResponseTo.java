package com.ringcentral.definitions;


public class FaxResponseTo {
    /**
     * Phone number in E.164 (with &#039;+&#039; sign) format
     * Example: +18661234567
     */
    public String phoneNumber;
    /**
     * Name of a fax recipient listed on a fax cover page
     */
    public String name;
    /**
     * Message status. Different message types may have different
     * allowed status values. For outbound faxes the aggregated message status
     * is returned. If, for outbound message, a status for at least one recipient is &#039;Queued&#039;, then
     * the &#039;Queued&#039; value is returned. If a status for at least one recipient is
     * &#039;SendingFailed&#039;, then the &#039;SendingFailed&#039; value is returned. In other cases
     * the &#039;Sent&#039; status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;

    public FaxResponseTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public FaxResponseTo name(String name) {
        this.name = name;
        return this;
    }

    public FaxResponseTo messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
}
