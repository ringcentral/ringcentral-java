package com.ringcentral.definitions;


public class CreateMessageStoreReportRequest {
    /**
     * Only messages created before the date will be collected. The default value is current time
     */
    public String dateTo;
    /**
     * Only messages created after (or including) the date will be collected. The default value is current time minus 24 hours
     */
    public String dateFrom;
    /**
     * Enum: EMail, Fax, SMS, VoiceMail, Pager, Text
     */
    public String[] messageTypes;

    public CreateMessageStoreReportRequest dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public CreateMessageStoreReportRequest dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public CreateMessageStoreReportRequest messageTypes(String[] messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }
}
