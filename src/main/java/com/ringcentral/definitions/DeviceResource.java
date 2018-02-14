package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceResource
{
    // Internal identifier of a device
    public String id;
    public DeviceResource id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a device
    public String uri;
    public DeviceResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example 'HP-56-2-2'
    public String sku;
    public DeviceResource sku(String sku) {
        this.sku = sku;
        return this;
    }
    // Device type. The default value is 'HardPhone'
    public String type;
    public DeviceResource type(String type) {
        this.type = type;
        return this;
    }
    // Status of a device = ['Online', 'Offline']
    public String status;
    public DeviceResource status(String status) {
        this.status = status;
        return this;
    }
    // Device name. Mandatory if ordering SoftPhone or OtherPhone . Optional for HardPhone . If not specified for HardPhone, then device model name is used as device name
    public String name;
    public DeviceResource name(String name) {
        this.name = name;
        return this;
    }
    // Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
    public String serial;
    public DeviceResource serial(String serial) {
        this.serial = serial;
        return this;
    }
    // PC name for softphone
    public String computerName;
    public DeviceResource computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }
    // HardPhone model information
    public DeviceModelResource model;
    public DeviceResource model(DeviceModelResource model) {
        this.model = model;
        return this;
    }
    // This attribute can be omitted for unassigned devices
    public ExtensionResourceIntId extension;
    public DeviceResource extension(ExtensionResourceIntId extension) {
        this.extension = extension;
        return this;
    }
    // Phone lines information
    public PhoneLineResource[] phoneLines;
    public DeviceResource phoneLines(PhoneLineResource[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }
    //  Address for emergency cases. The same emergency address is assigned to all numbers of a single device ,
    public EmergencyServiceAddressResource emergencyServiceAddress;
    public DeviceResource emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }
    // Shipping information, according to which devices (in case of HardPhone ) or e911 stickers (in case of SoftPhone and OtherPhone ) will be delivered to the customer
    public ShippingResource shipping;
    public DeviceResource shipping(ShippingResource shipping) {
        this.shipping = shipping;
        return this;
    }
    // Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. Either model structure, or boxBillingId must be specified for HardPhone
    public Long boxBillingId;
    public DeviceResource boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }
    // Pooling type of a deviceHost - device with standalone paid phone line which can be linked to Glip/Softphone instanceGuest - device with a linked phone lineNone - device without a phone line or with specific line (free, BLA, etc.) = ['Host', 'Guest', 'None']
    public String linePooling;
    public DeviceResource linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }
}
