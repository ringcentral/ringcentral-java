package com.ringcentral.definitions;


public class AddDeviceToInventoryResponse {
    /**
     * Required
     */
    public AddDeviceToInventoryResponseDevices[] devices;
    /**
     * Required
     */
    public SiteBasicInfo site;

    public AddDeviceToInventoryResponse devices(AddDeviceToInventoryResponseDevices[] devices) {
        this.devices = devices;
        return this;
    }

    public AddDeviceToInventoryResponse site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }
}
