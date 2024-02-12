package com.ringcentral.definitions;


public class SipRegistrationDeviceInfo {
    /**
     * Canonical URI of the resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Device type
     * Enum: HardPhone, SoftPhone, OtherPhone, Paging, WebPhone, Room
     */
    public String type;
    /**
     * Device identification number (SKU, Stock Keeping Unit) in the format
     * TP-ID [-AT-AC], where TP is device type (HP for RC desk phones, DV for all
     * other devices including soft phones); ID - device model ID; AT - add-on type
     * ID; AC - add-on count (if any). For example &#039;HP-56-2-2&#039;
     */
    public String sku;
    /**
     * Enum: Online, Offline
     */
    public String status;
    /**
     * Device name. Mandatory if ordering  SoftPhone or OtherPhone.
     * Optional for HardPhone. If not specified for HardPhone, then device  model  name
     * is used as device  name
     */
    public String name;
    /**
     * Serial number for HardPhone (is returned only when the phone
     * is shipped and provisioned); endpoint_id for Softphone and mobile applications
     */
    public String serial;
    /**
     * Computer name (for devices of `SoftPhone` type only)
     */
    public String computerName;
    /**
     *
     */
    public DeviceModelInfo model;
    /**
     *
     */
    public DeviceExtensionInfo extension;
    /**
     *
     */
    public DeviceEmergencyServiceAddressResourceDefault emergencyServiceAddress;
    /**
     *
     */
    public SipRegistrationDeviceEmergencyInfo emergency;
    /**
     *
     */
    public ShippingInfo shipping;
    /**
     * Phone lines information
     */
    public DevicePhoneLinesInfo[] phoneLines;
    /**
     * Box billing identifier of a device. Applicable only for HardPhones.
     * It is an alternative way to identify the device to be ordered. Either
     * model  structure, or  boxBillingId  must be specified forT?HardPhone
     * Format: int64
     */
    public Long boxBillingId;
    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    /**
     * Pooling type of device:
     * - `Host` - device with standalone paid
     * phone line which can be linked to soft phone client instance
     * - `Guest` - device with a linked phone line
     * - `None` - device without a phone line or with specific line (free, BLA, etc.)
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     * Network location status. `true` if the device is located in
     * the configured corporate network (On-Net); `false` for Off-Net location.
     * Parameter is not returned if `EmergencyAddressAutoUpdate` feature is not
     * enabled for the account/user, or if device network location is not determined
     */
    public Boolean inCompanyNet;
    /**
     *
     */
    public DeviceSiteInfo site;
    /**
     * Timestamp of receiving last location report in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastLocationReportTime;

    public SipRegistrationDeviceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SipRegistrationDeviceInfo id(String id) {
        this.id = id;
        return this;
    }

    public SipRegistrationDeviceInfo type(String type) {
        this.type = type;
        return this;
    }

    public SipRegistrationDeviceInfo sku(String sku) {
        this.sku = sku;
        return this;
    }

    public SipRegistrationDeviceInfo status(String status) {
        this.status = status;
        return this;
    }

    public SipRegistrationDeviceInfo name(String name) {
        this.name = name;
        return this;
    }

    public SipRegistrationDeviceInfo serial(String serial) {
        this.serial = serial;
        return this;
    }

    public SipRegistrationDeviceInfo computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    public SipRegistrationDeviceInfo model(DeviceModelInfo model) {
        this.model = model;
        return this;
    }

    public SipRegistrationDeviceInfo extension(DeviceExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public SipRegistrationDeviceInfo emergencyServiceAddress(DeviceEmergencyServiceAddressResourceDefault emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public SipRegistrationDeviceInfo emergency(SipRegistrationDeviceEmergencyInfo emergency) {
        this.emergency = emergency;
        return this;
    }

    public SipRegistrationDeviceInfo shipping(ShippingInfo shipping) {
        this.shipping = shipping;
        return this;
    }

    public SipRegistrationDeviceInfo phoneLines(DevicePhoneLinesInfo[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }

    public SipRegistrationDeviceInfo boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }

    public SipRegistrationDeviceInfo useAsCommonPhone(Boolean useAsCommonPhone) {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    public SipRegistrationDeviceInfo linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public SipRegistrationDeviceInfo inCompanyNet(Boolean inCompanyNet) {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    public SipRegistrationDeviceInfo site(DeviceSiteInfo site) {
        this.site = site;
        return this;
    }

    public SipRegistrationDeviceInfo lastLocationReportTime(String lastLocationReportTime) {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }
}
