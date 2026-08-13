package com.ringcentral.definitions;

public class WebAppDevicesResponse {
    /** List of Web Phone devices */
    public WebAppDeviceRecord[] records;

    public WebAppDevicesResponse records(WebAppDeviceRecord[] records) {
        this.records = records;
        return this;
    }
}
