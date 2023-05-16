package com.ringcentral.definitions;


public class BulkAddDevicesItem {
    /**
     * Internal identifier of a cost center
     * Example: 224149
     */
    public String costCenterId;
    /**
     * Required
     */
    public BulkOperationExtensionReference extension;
    /**
     * Device type. Only &quot;OtherPhone&quot; and &quot;WebRTC&quot; device types are supported at the moment
     * Required
     * Enum: OtherPhone, WebRTC
     */
    public String type;
    /**
     * Only &quot;address&quot; is supported at the moment
     * Required
     */
    public BulkAddDevicesItemEmergency emergency;
    /**
     * To be used to assign a number by id
     * Required
     */
    public BulkAddDevicesItemPhoneInfo phoneInfo;

    public BulkAddDevicesItem costCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }

    public BulkAddDevicesItem extension(BulkOperationExtensionReference extension) {
        this.extension = extension;
        return this;
    }

    public BulkAddDevicesItem type(String type) {
        this.type = type;
        return this;
    }

    public BulkAddDevicesItem emergency(BulkAddDevicesItemEmergency emergency) {
        this.emergency = emergency;
        return this;
    }

    public BulkAddDevicesItem phoneInfo(BulkAddDevicesItemPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
