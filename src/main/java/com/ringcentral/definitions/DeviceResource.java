package com.ringcentral.definitions;


public class DeviceResource
{
    /**
     */
    public String id;
    public DeviceResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public DeviceResourceAccount account;
    public DeviceResource account(DeviceResourceAccount account)
    {
        this.account = account;
        return this;
    }

    /**
     */
    public String phoneLineId;
    public DeviceResource phoneLineId(String phoneLineId)
    {
        this.phoneLineId = phoneLineId;
        return this;
    }

    /**
     * Enum: InProgress, PendingReplacement, Delivered
     */
    public String orderStatus;
    public DeviceResource orderStatus(String orderStatus)
    {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     */
    public String type;
    public DeviceResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String name;
    public DeviceResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public DeviceResourceSite site;
    public DeviceResource site(DeviceResourceSite site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public DeviceResourceExtension extension;
    public DeviceResource extension(DeviceResourceExtension extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public DeviceResourcePhoneNumber phoneNumber;
    public DeviceResource phoneNumber(DeviceResourcePhoneNumber phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     */
    public String serial;
    public DeviceResource serial(String serial)
    {
        this.serial = serial;
        return this;
    }

    /**
     * Enum: AssignedUserPhone, UnassignedUserPhone, UnassignedPhone
     */
    public String assignedType;
    public DeviceResource assignedType(String assignedType)
    {
        this.assignedType = assignedType;
        return this;
    }
}