package com.ringcentral.definitions;


public class DeviceResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public DeviceResourceAccount account;
    /**
     *
     */
    public String phoneLineId;
    /**
     * Enum: InProgress, PendingReplacement, Delivered
     */
    public String orderStatus;
    /**
     *
     */
    public String type;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public DeviceResourceSite site;
    /**
     *
     */
    public DeviceResourceExtension extension;
    /**
     *
     */
    public DeviceResourcePhoneNumber phoneNumber;
    /**
     *
     */
    public String serial;
    /**
     * Enum: AssignedUserPhone, UnassignedUserPhone, UnassignedPhone
     */
    public String assignedType;

    public DeviceResource id(String id) {
        this.id = id;
        return this;
    }

    public DeviceResource account(DeviceResourceAccount account) {
        this.account = account;
        return this;
    }

    public DeviceResource phoneLineId(String phoneLineId) {
        this.phoneLineId = phoneLineId;
        return this;
    }

    public DeviceResource orderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public DeviceResource type(String type) {
        this.type = type;
        return this;
    }

    public DeviceResource name(String name) {
        this.name = name;
        return this;
    }

    public DeviceResource site(DeviceResourceSite site) {
        this.site = site;
        return this;
    }

    public DeviceResource extension(DeviceResourceExtension extension) {
        this.extension = extension;
        return this;
    }

    public DeviceResource phoneNumber(DeviceResourcePhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public DeviceResource serial(String serial) {
        this.serial = serial;
        return this;
    }

    public DeviceResource assignedType(String assignedType) {
        this.assignedType = assignedType;
        return this;
    }
}
