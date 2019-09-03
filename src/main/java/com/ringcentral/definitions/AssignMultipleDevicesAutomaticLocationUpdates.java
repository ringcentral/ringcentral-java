package com.ringcentral.definitions;


public class AssignMultipleDevicesAutomaticLocationUpdates {
    /**
     *
     */
    public String[] enabledDeviceIds;
    /**
     *
     */
    public String[] disabledDeviceIds;

    public AssignMultipleDevicesAutomaticLocationUpdates enabledDeviceIds(String[] enabledDeviceIds) {
        this.enabledDeviceIds = enabledDeviceIds;
        return this;
    }

    public AssignMultipleDevicesAutomaticLocationUpdates disabledDeviceIds(String[] disabledDeviceIds) {
        this.disabledDeviceIds = disabledDeviceIds;
        return this;
    }

}
