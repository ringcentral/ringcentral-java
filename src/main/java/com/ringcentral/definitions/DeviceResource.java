package com.ringcentral.definitions;


public class DeviceResource {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Link to a device resource
     */
    public String uri;
    /**
     * Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example 'HP-56-2-2'
     */
    public String sku;
    /**
     * Device type
     * Default: HardPhone
     * Enum: BLA, HardPhone, SoftPhone, OtherPhone, Paging, WebPhone
     */
    public String type;
    /**
     * Status of a device
     * Enum: Online, Offline
     */
    public String status;
    /**
     * Site data
     */
    public DeviceSiteInfo site;
    /**
     * Device name. Mandatory if ordering SoftPhone or OtherPhone . Optional for HardPhone . If not specified for HardPhone, then device model name is used as device name
     */
    public String name;
    /**
     * Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
     */
    public String serial;
    /**
     * PC name for softphone
     */
    public String computerName;
    /**
     * HardPhone model information
     */
    public ModelInfo model;
    /**
     * This attribute can be omitted for unassigned devices
     */
    public ExtensionResourceIntId extension;
    /**
     * Phone lines information
     */
    public PhoneLineResource[] phoneLines;
    /**
     * Address for emergency cases. The same emergency address is assigned to all numbers of a single device
     */
    public EmergencyServiceAddressResource emergencyServiceAddress;
    /**
     * Shipping information, according to which devices (in case of HardPhone) or e911 stickers (in case of SoftPhone and OtherPhone) will be delivered to the customer
     */
    public ShippingResource shipping;
    /**
     * Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. Either  model structure, or boxBillingId must be specified for HardPhone
     */
    public Long boxBillingId;
    /**
     * Pooling type of a deviceHost - device with standalone paid phone line which can be linked to Glip/Softphone instanceGuest - device with a linked phone lineNone - device without a phone line or with specific line (free, BLA, etc.) = ['Host', 'Guest', 'None']
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    /**
     * Network location status. 'True' if device is located in the configured corporate network, in this case `bssid` or public/private IP addresses (`hostIp`) must be found in the corporate maps. If `bssid` is not found in the Wireless Access Points map, then the search is performed by public/private IP addresses in the IP Networks map. 'False' if network parameters are not found in corporate maps (`bssid` and public/private IP addresses for wi-fi or for Ethernet connection)
     */
    public Boolean inCompanyNet;
    /**
     * Datetime of receiving last location report in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z
     */
    public String lastLocationReportTime;

    public DeviceResource id(String id) {
        this.id = id;
        return this;
    }

    public DeviceResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DeviceResource sku(String sku) {
        this.sku = sku;
        return this;
    }

    public DeviceResource type(String type) {
        this.type = type;
        return this;
    }

    public DeviceResource status(String status) {
        this.status = status;
        return this;
    }

    public DeviceResource site(DeviceSiteInfo site) {
        this.site = site;
        return this;
    }

    public DeviceResource name(String name) {
        this.name = name;
        return this;
    }

    public DeviceResource serial(String serial) {
        this.serial = serial;
        return this;
    }

    public DeviceResource computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    public DeviceResource model(ModelInfo model) {
        this.model = model;
        return this;
    }

    public DeviceResource extension(ExtensionResourceIntId extension) {
        this.extension = extension;
        return this;
    }

    public DeviceResource phoneLines(PhoneLineResource[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }

    public DeviceResource emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public DeviceResource shipping(ShippingResource shipping) {
        this.shipping = shipping;
        return this;
    }

    public DeviceResource boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }

    public DeviceResource linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public DeviceResource useAsCommonPhone(Boolean useAsCommonPhone) {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    public DeviceResource inCompanyNet(Boolean inCompanyNet) {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    public DeviceResource lastLocationReportTime(String lastLocationReportTime) {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }

}
