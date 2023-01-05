package com.ringcentral.definitions;


    /**
* Query parameters for operation readCompanyCallLog
*/
public class ReadCompanyCallLogParameters
{
    /**
     * Short extension number of a user. If specified, returns call log for this particular extension only.
    * Cannot be combined with `phoneNumber` filter
     * Example: 101
     */
    public String extensionNumber;
    public ReadCompanyCallLogParameters extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Phone number of a caller/callee in e.164 format without a &#039;+&#039; sign. If specified, all incoming/outgoing calls
    * from/to this phone number are returned.
     * Example: 12053320032
     */
    public String phoneNumber;
    public ReadCompanyCallLogParameters phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The direction of call records to be included in the result. If omitted, both
    * inbound and outbound calls are returned. Multiple values are supported
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    public ReadCompanyCallLogParameters direction(String[] direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * The type of call records to be included in the result.
    * If omitted, all call types are returned. Multiple values are supported
     * Enum: Voice, Fax
     */
    public String[] type;
    public ReadCompanyCallLogParameters type(String[] type)
    {
        this.type = type;
        return this;
    }

    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    public ReadCompanyCallLogParameters view(String view)
    {
        this.view = view;
        return this;
    }

    /**
     * Deprecated, replaced with `recordingType` filter, still supported for compatibility reasons.
    * Indicates if only recorded calls should be returned.
    * 
    * If both `withRecording` and `recordingType` parameters are specified, then `withRecording` is ignored&#039;
     */
    public Boolean withRecording;
    public ReadCompanyCallLogParameters withRecording(Boolean withRecording)
    {
        this.withRecording = withRecording;
        return this;
    }

    /**
     * Indicates that call records with recordings of particular type should be returned.
    * If omitted, then calls with and without recordings are returned
     * Enum: Automatic, OnDemand, All
     */
    public String recordingType;
    public ReadCompanyCallLogParameters recordingType(String recordingType)
    {
        this.recordingType = recordingType;
        return this;
    }

    /**
     * The beginning of the time range to return call records in ISO 8601 format including timezone,
    * for example 2016-03-10T18:07:52.534Z. The default value is `dateTo` minus 24 hours
     * Format: date-time
     */
    public String dateFrom;
    public ReadCompanyCallLogParameters dateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * The end of the time range to return call records in ISO 8601 format including timezone,
    * for example 2016-03-10T18:07:52.534Z. The default value is current time
     * Format: date-time
     */
    public String dateTo;
    public ReadCompanyCallLogParameters dateTo(String dateTo)
    {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    public ReadCompanyCallLogParameters sessionId(String sessionId)
    {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Minimum: 1
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ReadCompanyCallLogParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates the page size (number of items)
     * Minimum: 1
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ReadCompanyCallLogParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}