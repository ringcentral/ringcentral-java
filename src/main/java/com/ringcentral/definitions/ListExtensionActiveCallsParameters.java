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

    /**
     * Indicates the page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ListExtensionActiveCallsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}