package com.ringcentral.definitions;


public class CreateMessageStoreReportRequest {
    /**
     * Starting time for collecting messages. The default value equals to the current time minus 24 hours
     */
    public String dateFrom;
    /**
     * Ending time for collecting messages. The default value is the current time
     */
    public String dateTo;

    public CreateMessageStoreReportRequest dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public CreateMessageStoreReportRequest dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

}
