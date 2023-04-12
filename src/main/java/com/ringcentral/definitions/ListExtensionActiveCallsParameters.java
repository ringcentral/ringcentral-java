package com.ringcentral.definitions;


/**
 * Query parameters for operation listExtensionActiveCalls
 */
public class ListExtensionActiveCallsParameters {
    /**
     * The direction of call records to be included in the result. If omitted, both
     * inbound and outbound calls are returned. Multiple values are supported
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
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
     * Conference call type: RCC or RC Meetings. If not specified, no conference call filter applied
     * Enum: AudioConferencing, Meetings
     */
    public String[] conferenceType;
    /**
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Format: int32
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

    public ListExtensionActiveCallsParameters transport(String[] transport) {
        this.transport = transport;
        return this;
    }

    public ListExtensionActiveCallsParameters conferenceType(String[] conferenceType) {
        this.conferenceType = conferenceType;
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
