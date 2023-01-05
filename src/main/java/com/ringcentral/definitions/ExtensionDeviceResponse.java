package com.ringcentral.definitions;


public class ExtensionDeviceResponse
{
    /**
     * Internal identifier of a device
     */
    public String id;
    public ExtensionDeviceResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a device
     */
    public String uri;
    public ExtensionDeviceResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example &#039;HP-56-2-2&#039;
     */
    public String sku;
    public ExtensionDeviceResponse sku(String sku)
    {
        this.sku = sku;
        return this;
    }

    /**
     * Device type
     * Default: HardPhone
     * Enum: Room, SoftPhone, OtherPhone, HardPhone, Paging, WebRTC
     */
    public String type;
    public ExtensionDeviceResponse type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Device name. Mandatory if ordering  SoftPhone  or  OtherPhone. Optional for  HardPhone. If not specified for HardPhone, then device model name is used as device name
     */
    public String name;
    public ExtensionDeviceResponse name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Device status
     * Enum: Offline, Online
     */
    public String status;
    public ExtensionDeviceResponse status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
     */
    public String serial;
    public ExtensionDeviceResponse serial(String serial)
    {
        this.serial = serial;
        return this;
    }

    /**
     * PC name for softphone
     */
    public String computerName;
    public ExtensionDeviceResponse computerName(String computerName)
    {
        this.computerName = computerName;
        return this;
    }

    /**
     */
    public ModelInfo model;
    public ExtensionDeviceResponse model(ModelInfo model)
    {
        this.model = model;
        return this;
    }

    /**
     */
    public ExtensionInfoIntId extension;
    public ExtensionDeviceResponse extension(ExtensionInfoIntId extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public EmergencyServiceAddressResource emergencyServiceAddress;
    public ExtensionDeviceResponse emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress)
    {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    /**
     */
    public DeviceEmergencyInfo emergency;
    public ExtensionDeviceResponse emergency(DeviceEmergencyInfo emergency)
    {
        this.emergency = emergency;
        return this;
    }

    /**
     * Phone lines information
     */
    public PhoneLinesInfo[] phoneLines;
    public ExtensionDeviceResponse phoneLines(PhoneLinesInfo[] phoneLines)
    {
        this.phoneLines = phoneLines;
        return this;
    }

    /**
     */
    public ShippingInfo shipping;
    public ExtensionDeviceResponse shipping(ShippingInfo shipping)
    {
        this.shipping = shipping;
        return this;
    }

    /**
     * Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. Either model  structure, or  boxBillingId  must be specified for HardPhone
     * Format: int64
     */
    public Long boxBillingId;
    public ExtensionDeviceResponse boxBillingId(Long boxBillingId)
    {
        this.boxBillingId = boxBillingId;
        return this;
    }

    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    public ExtensionDeviceResponse useAsCommonPhone(Boolean useAsCommonPhone)
    {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    /**
     * Pooling type of a deviceHost - device with standalone paid phone line which can be linked to Glip/Softphone instanceGuest - device with a linked phone lineNone - device without a phone line or with specific line (free, BLA, etc.) = [&#039;Host&#039;, &#039;Guest&#039;, &#039;None&#039;]
     * Enum: Host, Guest, None
     */
    public String linePooling;
    public ExtensionDeviceResponse linePooling(String linePooling)
    {
        this.linePooling = linePooling;
        return this;
    }

    /**
     * Network location status. &#039;True&#039; if the device is located in the configured corporate network (On-Net); &#039;False&#039; for Off-Net location. Parameter is not returned if `EmergencyAddressAutoUpdate` feature is not enabled for the account/user, or if device network location is not determined
     */
    public Boolean inCompanyNet;
    public ExtensionDeviceResponse inCompanyNet(Boolean inCompanyNet)
    {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    /**
     */
    public DeviceSiteInfo site;
    public ExtensionDeviceResponse site(DeviceSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Datetime of receiving last location report in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z
     */
    public String lastLocationReportTime;
    public ExtensionDeviceResponse lastLocationReportTime(String lastLocationReportTime)
    {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }
}