package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceOrderCreation
{
    // List of devices ordered
    public DeviceResource[] devices;
    public DeviceOrderCreation devices(DeviceResource[] devices) {
        this.devices = devices;
        return this;
    }
    // For Async Order Only. Information on device ordering task
    public TaskInfo task;
    public DeviceOrderCreation task(TaskInfo task) {
        this.task = task;
        return this;
    }
}
