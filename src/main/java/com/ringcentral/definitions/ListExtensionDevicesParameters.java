package com.ringcentral.definitions;


/**
 * Query parameters for operation listExtensionDevices
 */
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
    /**
     * Device type
     * Default: HardPhone
     * Enum: Room, SoftPhone, OtherPhone, HardPhone, Paging, WebRTC
     */
    public String line;
    /**
     * Type of phone line
     * Enum: Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;

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

    public ListExtensionDevicesParameters line(String line) {
        this.line = line;
        return this;
    }

    public ListExtensionDevicesParameters lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
}
