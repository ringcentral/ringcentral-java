package com.ringcentral.definitions;


/**
 * Query parameters for operation readUserCallLog
 */
public class ReadUserCallLogParameters {
    /**
     * Short extension number of a user. If specified, returns call log for this particular extension only.
     * Cannot be combined with `phoneNumber` filter
     * Example: 101
     */
    public String extensionNumber;
    /**
     * Phone number of a caller/callee in e.164 format without a &#039;+&#039; sign. If specified, all incoming/outgoing calls
     * from/to this phone number are returned.
     * Example: 12053320032
     */
    public String phoneNumber;
    /**
     * Indicates then calls from/to blocked numbers are returned
     * Default: true
     */
    public Boolean showBlocked;
    /**
     * The direction of call records to be included in the result. If omitted, both
     * inbound and outbound calls are returned. Multiple values are supported
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    /**
     * The type of call records to be included in the result.
     * If omitted, all call types are returned. Multiple values are supported
     * Enum: Voice, Fax
     */
    public String[] type;
    /**
     * The type of call transport. Multiple values are supported. By default this filter is disabled
     * Enum: PSTN, VoIP
     */
    public String[] transport;
    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * Deprecated, replaced with `recordingType` filter, still supported for compatibility reasons.
     * Indicates if only recorded calls should be returned.
     * <p>
     * If both `withRecording` and `recordingType` parameters are specified, then `withRecording` is ignored&#039;
     */
    public Boolean withRecording;
    /**
     * Indicates that call records with recordings of particular type should be returned.
     * If omitted, then calls with and without recordings are returned
     * Enum: Automatic, OnDemand, All
     */
    public String recordingType;
    /**
     * The end of the time range to return call records in ISO 8601 format including timezone,
     * for example 2016-03-10T18:07:52.534Z. The default value is current time
     * Format: date-time
     */
    public String dateTo;
    /**
     * The beginning of the time range to return call records in ISO 8601 format including timezone,
     * for example 2016-03-10T18:07:52.534Z. The default value is `dateTo` minus 24 hours
     * Format: date-time
     */
    public String dateFrom;
    /**
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Minimum: 1
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items). The default value is 100.
     * The maximum value for `Simple` view is 1000, for `Detailed` view - 250
     * Minimum: 1
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    /**
     * Indicates that deleted calls records should be returned
     */
    public Boolean showDeleted;

    public ReadUserCallLogParameters extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ReadUserCallLogParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ReadUserCallLogParameters showBlocked(Boolean showBlocked) {
        this.showBlocked = showBlocked;
        return this;
    }

    public ReadUserCallLogParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public ReadUserCallLogParameters sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public ReadUserCallLogParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ReadUserCallLogParameters transport(String[] transport) {
        this.transport = transport;
        return this;
    }

    public ReadUserCallLogParameters view(String view) {
        this.view = view;
        return this;
    }

    public ReadUserCallLogParameters withRecording(Boolean withRecording) {
        this.withRecording = withRecording;
        return this;
    }

    public ReadUserCallLogParameters recordingType(String recordingType) {
        this.recordingType = recordingType;
        return this;
    }

    public ReadUserCallLogParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public ReadUserCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ReadUserCallLogParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ReadUserCallLogParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ReadUserCallLogParameters showDeleted(Boolean showDeleted) {
        this.showDeleted = showDeleted;
        return this;
    }
}
