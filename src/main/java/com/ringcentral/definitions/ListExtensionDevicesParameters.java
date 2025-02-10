package com.ringcentral.definitions;


/**
 * Query parameters for operation listExtensionDevices
 */
public class ListExtensionDevicesParameters {
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    /**
     * Pooling type of device - Host - a device with standalone paid phone line which can be linked to a soft client instance - Guest - a device with a linked phone line - None - a device without a phone line or with specific line (free, BLA, etc.)
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     * Device feature or multiple features supported
     * Enum: BLA, CommonPhone, Intercom, Paging, HELD
     */
    public String[] feature;
    /**
     * Device type
     * Default: HardPhone
     * Enum: HardPhone, SoftPhone, OtherPhone, MobileDevice, BLA, Paging, WebPhone, WebRTC, Room
     */
    public String type;
    /**
     * The type of phone line
     * Enum: Unknown, Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;

    public ListExtensionDevicesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionDevicesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListExtensionDevicesParameters linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public ListExtensionDevicesParameters feature(String[] feature) {
        this.feature = feature;
        return this;
    }

    public ListExtensionDevicesParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListExtensionDevicesParameters lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
}
