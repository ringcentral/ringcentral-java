package com.ringcentral.definitions;


public class FaxResponseTo {
    /**
     * Internal identifier of a fax recipient
     */
    public String recipientId;
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
     * is returned. If, for multi-recipient outbound message, a status for
     * at least one recipient is `Queued`, then the `Queued` value is returned.
     * If a status for at least one recipient is `SendingFailed`,
     * then the &#039;SendingFailed&#039; value is returned. In other cases,
     * the `Sent` status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * Contains party location (city, state) if one can be determined
     * from phoneNumber. This property is filled only when phoneNumber is not
     * empty and server can calculate location information from it (for example,
     * this information is unavailable for US toll-free numbers)
     */
    public String location;

    public FaxResponseTo recipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }

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

    public FaxResponseTo location(String location) {
        this.location = location;
        return this;
    }
}
