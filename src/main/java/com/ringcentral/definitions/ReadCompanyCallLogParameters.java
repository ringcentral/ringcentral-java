package com.ringcentral.definitions;


public class ReadCompanyCallLogParameters {
    /**
     * Extension number of a user. If specified, returns call log for a particular extension only
     */
    public String extensionNumber;
    /**
     * Phone number of a caller/call recipient. If specified, returns all calls (both incoming and outcoming) with the phone number specified. Cannot be specified together with the extensionNumber filter
     */
    public String phoneNumber;
    /**
     * The direction for the result records. If not specified, both inbound and outbound records are returned. Multiple values are accepted
     */
    public String[] direction;
    /**
     * Call type of a record. If not specified, all call types are returned. Multiple values are accepted
     */
    public String[] type;
    /**
     * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * **Deprecated**. Supported for compatibility reasons only. `true` if only recorded calls are returned. The default value is `false`. If both `withRecording` and `recordingType` are specified, `withRecording` is ignored
     */
    public Boolean withRecording;
    /**
     * Type of a call recording. If not specified, then calls without recordings are also returned
     * Enum: Automatic, OnDemand, All
     */
    public String recordingType;
    /**
     * The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
     */
    public String dateFrom;
    /**
     * The end datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
     */
    public String dateTo;
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    /**
     * Internal identifier of a session
     */
    public String sessionId;

    public ReadCompanyCallLogParameters extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ReadCompanyCallLogParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ReadCompanyCallLogParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public ReadCompanyCallLogParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ReadCompanyCallLogParameters view(String view) {
        this.view = view;
        return this;
    }

    public ReadCompanyCallLogParameters withRecording(Boolean withRecording) {
        this.withRecording = withRecording;
        return this;
    }

    public ReadCompanyCallLogParameters recordingType(String recordingType) {
        this.recordingType = recordingType;
        return this;
    }

    public ReadCompanyCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ReadCompanyCallLogParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public ReadCompanyCallLogParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ReadCompanyCallLogParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ReadCompanyCallLogParameters sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

}
