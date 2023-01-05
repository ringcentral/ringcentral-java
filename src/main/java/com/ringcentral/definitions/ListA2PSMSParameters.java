package com.ringcentral.definitions;


    /**
* Query parameters for operation listA2PSMS
*/
public class ListA2PSMSParameters
{
    /**
     * Internal identifier of a message batch to filter the response
     * Example: 55577
     */
    public String batchId;
    public ListA2PSMSParameters batchId(String batchId)
    {
        this.batchId = batchId;
        return this;
    }

    /**
     * Direction of the SMS message
     * Example: Inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    public ListA2PSMSParameters direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * The end of the time range to filter the results in ISO 8601 format including timezone. Default is the &#039;dateTo&#039; minus 24 hours
     * Format: date-time
     * Example: Mon Nov 09 2020 08:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String dateFrom;
    public ListA2PSMSParameters dateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * The end of the time range to filter the results in ISO 8601 format including timezone. Default is the current time
     * Format: date-time
     * Example: Wed Nov 25 2020 08:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String dateTo;
    public ListA2PSMSParameters dateTo(String dateTo)
    {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Indicates if the response has to be detailed, includes text in the response if detailed
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    public ListA2PSMSParameters view(String view)
    {
        this.view = view;
        return this;
    }

    /**
     * List of phone numbers (specified in &#039;to&#039; or &#039;from&#039; fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
     * Example: 15551234455,15551235577
     */
    public String[] phoneNumber;
    public ListA2PSMSParameters phoneNumber(String[] phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The page token of the page to be retrieved.
     * Example: pgt1
     */
    public String pageToken;
    public ListA2PSMSParameters pageToken(String pageToken)
    {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * The number of messages to be returned per request
     * Format: int32
     * Example: 1
     * Default: 1000
     */
    public Long perPage;
    public ListA2PSMSParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}