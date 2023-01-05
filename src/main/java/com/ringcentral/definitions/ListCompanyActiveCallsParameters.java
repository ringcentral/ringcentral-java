package com.ringcentral.definitions;


    /**
* Query parameters for operation listCompanyActiveCalls
*/
public class ListCompanyActiveCallsParameters
{
    /**
     * The direction of call records to be included in the result. If omitted, both
    * inbound and outbound calls are returned. Multiple values are supported
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    public ListCompanyActiveCallsParameters direction(String[] direction)
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
    public ListCompanyActiveCallsParameters view(String view)
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
    public ListCompanyActiveCallsParameters type(String[] type)
    {
        this.type = type;
        return this;
    }

    /**
     * The type of call transport. Multiple values are supported. By default this filter is disabled
     * Enum: PSTN, VoIP
     */
    public String[] transport;
    public ListCompanyActiveCallsParameters transport(String[] transport)
    {
        this.transport = transport;
        return this;
    }

    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Minimum: 1
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListCompanyActiveCallsParameters page(Long page)
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
    public ListCompanyActiveCallsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}