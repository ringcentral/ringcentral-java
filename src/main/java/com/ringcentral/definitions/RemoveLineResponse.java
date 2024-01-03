package com.ringcentral.definitions;


public class RemoveLineResponse {
    /**
     * Internal identifier of a source device
     * Required
     */
    public String id;
    /**
     * Device type
     * Required
     * Default: HardPhone
     * Enum: HardPhone, SoftPhone, OtherPhone, MobileDevice, BLA, Paging, WebPhone, WebRTC, ZoomMobile, ZoomPhone, Room, Unknown
     */
    public String type;
    /**
     * The display name of a source device
     * Required
     * Example: My Device N1
     */
    public String name;
    /**
     * Serial number of a device (HardPhone)
     * Example: ff:ff:ff:ff:ff:ff
     */
    public String serial;

    public RemoveLineResponse id(String id) {
        this.id = id;
        return this;
    }

    public RemoveLineResponse type(String type) {
        this.type = type;
        return this;
    }

    public RemoveLineResponse name(String name) {
        this.name = name;
        return this;
    }

    public RemoveLineResponse serial(String serial) {
        this.serial = serial;
        return this;
    }
}
