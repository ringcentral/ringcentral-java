package com.ringcentral.definitions;


public class BatchProvisionUsersRequestItemDevices {
    /**
     *
     */
    public DeviceDefinition deviceInfo;

    public BatchProvisionUsersRequestItemDevices deviceInfo(DeviceDefinition deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
}
