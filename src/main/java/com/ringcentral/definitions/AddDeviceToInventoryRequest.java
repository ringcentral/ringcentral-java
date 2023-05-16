package com.ringcentral.definitions;


public class AddDeviceToInventoryRequest {
    /**
     * Device type. Use `OtherPhone` to indicate BYOD (customer provided) device
     * Required
     * Enum: OtherPhone
     */
    public String type;
    /**
     * Quantity of devices (total quantity should not exceed 50)
     * Required
     * Maximum: 50
     * Minimum: 1
     * Format: int32
     */
    public Long quantity;
    /**
     *
     */
    public AddDeviceToInventoryRequestSite site;

    public AddDeviceToInventoryRequest type(String type) {
        this.type = type;
        return this;
    }

    public AddDeviceToInventoryRequest quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public AddDeviceToInventoryRequest site(AddDeviceToInventoryRequestSite site) {
        this.site = site;
        return this;
    }
}
