package com.ringcentral.definitions;


public class ListExtensionActiveCallsParameters {
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
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;

    public ListExtensionActiveCallsParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public ListExtensionActiveCallsParameters view(String view) {
        this.view = view;
        return this;
    }

    public ListExtensionActiveCallsParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ListExtensionActiveCallsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionActiveCallsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
