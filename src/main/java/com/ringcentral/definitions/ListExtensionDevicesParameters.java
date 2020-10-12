package com.ringcentral.definitions;


public class ListExtensionDevicesParameters {
    /**
     * Pooling type of a device
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     * Device feature or multiple features supported
     * Enum: Intercom, Paging, BLA, HELD
     */
    public String feature;
    
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

    public ListExtensionDevicesParameters linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public ListExtensionDevicesParameters feature(String feature) {
        this.feature = feature;
        return this;
    }
    
    public ListExtensionDevicesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionDevicesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
