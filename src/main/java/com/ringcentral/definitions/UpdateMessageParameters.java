package com.ringcentral.definitions;


public class UpdateMessageParameters {
    /**
     *
     */
    public String dateFrom;
    /**
     * Enum: Fax, SMS, VoiceMail, Pager, Text, All
     */
    public String type;

    public UpdateMessageParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public UpdateMessageParameters type(String type) {
        this.type = type;
        return this;
    }

}
