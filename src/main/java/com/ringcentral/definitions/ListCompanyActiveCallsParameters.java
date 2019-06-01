package com.ringcentral.definitions;


public class ListCompanyActiveCallsParameters {
    /**
     * The direction for the result records. If not specified, both inbound and outbound records are returned. Multiple values are accepted
     */
    public String[] direction;
    /**
     * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * Call type of a record. If not specified, all call types are returned. Multiple values are accepted
     */
    public String[] type;
    /**
     * Call transport type. 'PSTN' specifies that a call leg is initiated from the PSTN network provider; 'VoIP' - from an RC phone. By default this filter is disabled
     */
    public String[] transport;
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

    public ListCompanyActiveCallsParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public ListCompanyActiveCallsParameters view(String view) {
        this.view = view;
        return this;
    }

    public ListCompanyActiveCallsParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ListCompanyActiveCallsParameters transport(String[] transport) {
        this.transport = transport;
        return this;
    }

    public ListCompanyActiveCallsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListCompanyActiveCallsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
