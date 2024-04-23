package com.ringcentral.definitions;


public class DeviceResource {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Canonical URI of a device
     * Format: uri
     */
    public String uri;
    /**
     * Device identification number (SKU, Stock Keeping Unit) in the format
     * TP-ID [-AT-AC], where TP is device type (HP for RC desk phones, DV for all
     * other devices including soft phones); ID - device model ID; AT - add-on type
     * ID; AC - add-on count (if any). For example &#039;HP-56-2-2&#039;
     */
    public String sku;
    /**
     * Device type
     * Default: HardPhone
     * Enum: BLA, SoftPhone, OtherPhone, HardPhone, WebPhone, Paging, Room, WebRTC
     */
    public String type;
    /**
     * Device name. Mandatory if ordering SoftPhone or OtherPhone.
     * Optional for HardPhone. If not specified for HardPhone, then
     * a device model is used as a device name
     */
    public String name;
    /**
     * Serial number for HardPhone (is returned only when the phone
     * is shipped and provisioned); endpoint ID for SoftPhone and
     * mobile applications
     */
    public String serial;
    /**
     * Device status
     * Enum: Offline, Online
     */
    public String status;
    /**
     * Computer name (for devices of `SoftPhone` type only)
     */
    public String computerName;
    /**
     *
     */
    public ModelInfo model;
    /**
     *
     */
    public ExtensionInfoIntId extension;
    /**
     *
     */
    public DeviceEmergencyInfo emergency;
    /**
     *
     */
    public EmergencyServiceAddressResource emergencyServiceAddress;
    /**
     * Phone lines information
     */
    public PhoneLinesInfo[] phoneLines;
    /**
     *
     */
    public ShippingInfo shipping;
    /**
     * Box billing identifier of a device. Applicable only for devices of `HardPhone` type.
     * It is an alternative way to identify the device to be ordered. Either
     * `model` structure, or `boxBillingId` must be specified
     * Format: int64
     */
    public Long boxBillingId;
    /**
     * Supported only for devices assigned to Limited extensions.
     * If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    /**
     * This flag indicates whether this device is used for hot desking or not
     */
    public Boolean hotDeskDevice;
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
     * Date/time of receiving last location report in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastLocationReportTime;
    /**
     * Pooling type of device:
     * - `Host` - device with a standalone paid phone line which can be linked to soft phone client instance;
     * - `Guest` - device with a linked phone line;
     * - `None` - device without a phone line or with a specific line (free, BLA, etc.)
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     *
     */
    public BillingStatementInfo billingStatement;

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

    public DeviceResource name(String name) {
        this.name = name;
        return this;
    }

    public DeviceResource serial(String serial) {
        this.serial = serial;
        return this;
    }

    public DeviceResource status(String status) {
        this.status = status;
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

    public DeviceResource extension(ExtensionInfoIntId extension) {
        this.extension = extension;
        return this;
    }

    public DeviceResource emergency(DeviceEmergencyInfo emergency) {
        this.emergency = emergency;
        return this;
    }

    public DeviceResource emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public DeviceResource phoneLines(PhoneLinesInfo[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }

    public DeviceResource shipping(ShippingInfo shipping) {
        this.shipping = shipping;
        return this;
    }

    public DeviceResource boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }

    public DeviceResource useAsCommonPhone(Boolean useAsCommonPhone) {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    public DeviceResource hotDeskDevice(Boolean hotDeskDevice) {
        this.hotDeskDevice = hotDeskDevice;
        return this;
    }

    public DeviceResource inCompanyNet(Boolean inCompanyNet) {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    public DeviceResource site(DeviceSiteInfo site) {
        this.site = site;
        return this;
    }

    public DeviceResource lastLocationReportTime(String lastLocationReportTime) {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }

    public DeviceResource linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public DeviceResource billingStatement(BillingStatementInfo billingStatement) {
        this.billingStatement = billingStatement;
        return this;
    }
}
