package com.ringcentral.definitions;


// Query parameters for operation listExtensionDevices
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
     * Number of a page to be returned
     * Default: 1
     */
    public String page;
    /**
     * Number of records per page to be returned
     * Default: 100
     */
    public String perPage;

    public ListExtensionDevicesParameters linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public ListExtensionDevicesParameters feature(String feature) {
        this.feature = feature;
        return this;
    }

    public ListExtensionDevicesParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListExtensionDevicesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
}
