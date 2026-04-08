package com.ringcentral.definitions;

public class AddDeviceToInventoryResponse {
    /** Required */
    public AddDeviceToInventoryResponseDevices[] devices;

    public AddDeviceToInventoryResponse devices(AddDeviceToInventoryResponseDevices[] devices) {
        this.devices = devices;
        return this;
    }

    /** Required */
    public SiteBasicInfo site;

    public AddDeviceToInventoryResponse site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }
}
