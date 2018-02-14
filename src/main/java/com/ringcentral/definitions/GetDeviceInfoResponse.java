package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetDeviceInfoResponse
{
    // Internal identifier of a device
    public String id;
    public GetDeviceInfoResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a device
    public String uri;
    public GetDeviceInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example 'HP-56-2-2'
    public String sku;
    public GetDeviceInfoResponse sku(String sku) {
        this.sku = sku;
        return this;
    }
    // Device type. The default value is 'HardPhone'
    public String type;
    public GetDeviceInfoResponse type(String type) {
        this.type = type;
        return this;
    }
    // Device name. Mandatory if ordering  SoftPhone  or  OtherPhone . Optional for  HardPhone . If not specified for HardPhone, then device model  name is used as device  name
    public String name;
    public GetDeviceInfoResponse name(String name) {
        this.name = name;
        return this;
    }
    // Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
    public String serial;
    public GetDeviceInfoResponse serial(String serial) {
        this.serial = serial;
        return this;
    }
    // PC name for softphone
    public String computerName;
    public GetDeviceInfoResponse computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }
    // HardPhone model information
    public ModelInfo model;
    public GetDeviceInfoResponse model(ModelInfo model) {
        this.model = model;
        return this;
    }
    // This attribute can be omitted for unassigned devices
    public ExtensionInfoIntId extension;
    public GetDeviceInfoResponse extension(ExtensionInfoIntId extension) {
        this.extension = extension;
        return this;
    }
    // Address for emergency cases. The same emergency address is assigned to all the numbers of one device
    public EmergencyAddressInfo emergencyServiceAddress;
    public GetDeviceInfoResponse emergencyServiceAddress(EmergencyAddressInfo emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }
    // Phone lines information
    public PhoneLinesInfo[] phoneLines;
    public GetDeviceInfoResponse phoneLines(PhoneLinesInfo[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }
    // Shipping information, according to which devices (in case of HardPhone ) or e911 stickers (in case of  SoftPhone  and  OtherPhone ) will be delivered to the customer
    public ShippingInfo shipping;
    public GetDeviceInfoResponse shipping(ShippingInfo shipping) {
        this.shipping = shipping;
        return this;
    }
    // Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. EitherT? model  structure, or  boxBillingId  must be specified forT?HardPhone
    public Long boxBillingId;
    public GetDeviceInfoResponse boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }
}
