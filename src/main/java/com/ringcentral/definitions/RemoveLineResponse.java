package com.ringcentral.definitions;

public class RemoveLineResponse {
    /** Internal identifier of a source device Required */
    public String id;

    public RemoveLineResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Device type Required Default: HardPhone Enum: HardPhone, SoftPhone, OtherPhone, MobileDevice,
     * BLA, Paging, WebPhone, WebRTC, ZoomMobile, ZoomPhone, Room, Unknown
     */
    public String type;

    public RemoveLineResponse type(String type) {
        this.type = type;
        return this;
    }

    /** The display name of a source device Required Example: My Device N1 */
    public String name;

    public RemoveLineResponse name(String name) {
        this.name = name;
        return this;
    }

    /** Serial number of a device (HardPhone) Example: ff:ff:ff:ff:ff:ff */
    public String serial;

    public RemoveLineResponse serial(String serial) {
        this.serial = serial;
        return this;
    }
}
