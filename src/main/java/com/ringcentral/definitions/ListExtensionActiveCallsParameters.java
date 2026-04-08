package com.ringcentral.definitions;


    /**
* Query parameters for operation listExtensionActiveCalls
*/
public class ListExtensionActiveCallsParameters
{
    /**
     * The direction of call records to be included in the result. If omitted, both
    * inbound and outbound calls are returned. Multiple values are supported
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    public ListExtensionActiveCallsParameters direction(String[] direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    public ListExtensionActiveCallsParameters view(String view)
    {
        this.view = view;
        return this;
    }

    /**
     * The type of call records to be included in the result.
    * If omitted, all call types are returned. Multiple values are supported
     * Enum: Voice, Fax
     */
    public String[] type;
    public ListExtensionActiveCallsParameters type(String[] type)
    {
        this.type = type;
        return this;
    }

    /**
     * The type of call transport. Multiple values are supported. By default, this filter is disabled
     * Enum: PSTN, VoIP
     */
    public String[] transport;
    public ListExtensionActiveCallsParameters transport(String[] transport)
    {
        this.transport = transport;
        return this;
    }

    /**
     * Conference call type: RCC or RC Meetings. If not specified, no conference call filter applied
     * Enum: AudioConferencing, Meetings
     */
    public String[] conferenceType;
    public ListExtensionActiveCallsParameters conferenceType(String[] conferenceType)
    {
        this.conferenceType = conferenceType;
        return this;
    }

    /**
     * The number of items per page. Accepts a positive integer (1–1000) or
    * the special value `&quot;max&quot;` which returns up to 1000 records.
    * If the provided integer value exceeds 1000, the maximum value of 1000 is applied.
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    public ListExtensionActiveCallsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListExtensionActiveCallsParameters page(Long page)
    {
        this.page = page;
        return this;
    }
}