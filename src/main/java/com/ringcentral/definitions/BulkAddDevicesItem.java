package com.ringcentral.definitions;

public class BulkAddDevicesItem {
    /** Internal identifier of a cost center Example: 224149 */
    public String costCenterId;

    public BulkAddDevicesItem costCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }

    /** Required */
    public BulkOperationExtensionReference extension;

    public BulkAddDevicesItem extension(BulkOperationExtensionReference extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Device type. Only &quot;OtherPhone&quot; and &quot;WebRTC&quot; device types are supported at
     * the moment Required Enum: OtherPhone, WebRTC
     */
    public String type;

    public BulkAddDevicesItem type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public BulkAddDevicesItemEmergency emergency;

    public BulkAddDevicesItem emergency(BulkAddDevicesItemEmergency emergency) {
        this.emergency = emergency;
        return this;
    }

    /** Assign a specific phone number Required */
    public BulkAddDevicesItemPhoneInfo phoneInfo;

    public BulkAddDevicesItem phoneInfo(BulkAddDevicesItemPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }

    /** The option that indicates whether Contact Center Phone Line should be created or not */
    public Boolean contactCenterPhoneLine;

    public BulkAddDevicesItem contactCenterPhoneLine(Boolean contactCenterPhoneLine) {
        this.contactCenterPhoneLine = contactCenterPhoneLine;
        return this;
    }
}
