package com.ringcentral.definitions;

public class WebAppDeviceRecord {
    /** Internal identifier of a device Required */
    public String id;

    public WebAppDeviceRecord id(String id) {
        this.id = id;
        return this;
    }

    /** Device type. Always `WebPhone` for Web Phone (RC App) devices Required Enum: WebPhone */
    public String type;

    public WebAppDeviceRecord type(String type) {
        this.type = type;
        return this;
    }

    /** Device name */
    public String name;

    public WebAppDeviceRecord name(String name) {
        this.name = name;
        return this;
    }

    /** Endpoint ID of the Web Phone (RC App) instance */
    public String serial;

    public WebAppDeviceRecord serial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Current registration status of the device. Set to `Online` when the device has an active
     * registration; otherwise `Offline`. Required Default: Offline Enum: Offline, Online
     */
    public String status;

    public WebAppDeviceRecord status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Time to live (TTL) of the current registration, in seconds. Returned only while the device
     * has an active registration. Format: int32
     */
    public Long expiresIn;

    public WebAppDeviceRecord expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
