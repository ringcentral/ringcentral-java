package com.ringcentral.definitions;


public class GetDeviceInfoResponse
{
    /**
     * Internal identifier of a device
     */
    public String id;
    public GetDeviceInfoResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a device
     */
    public String uri;
    public GetDeviceInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example &#039;HP-56-2-2&#039;
     */
    public String sku;
    public GetDeviceInfoResponse sku(String sku)
    {
        this.sku = sku;
        return this;
    }

    /**
     * Device type
     * Default: HardPhone
     * Enum: BLA, SoftPhone, OtherPhone, HardPhone, WebPhone, Paging, Room, WebRTC
     */
    public String type;
    public GetDeviceInfoResponse type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Device name. Mandatory if ordering  SoftPhone  or  OtherPhone. Optional for  HardPhone. If not specified for HardPhone, then device model name is used as device name
     */
    public String name;
    public GetDeviceInfoResponse name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
     */
    public String serial;
    public GetDeviceInfoResponse serial(String serial)
    {
        this.serial = serial;
        return this;
    }

    /**
     * Device status
     * Enum: Offline, Online
     */
    public String status;
    public GetDeviceInfoResponse status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * PC name for softphone
     */
    public String computerName;
    public GetDeviceInfoResponse computerName(String computerName)
    {
        this.computerName = computerName;
        return this;
    }

    /**
     */
    public ModelInfo model;
    public GetDeviceInfoResponse model(ModelInfo model)
    {
        this.model = model;
        return this;
    }

    /**
     */
    public ExtensionInfoIntId extension;
    public GetDeviceInfoResponse extension(ExtensionInfoIntId extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public DeviceEmergencyInfo emergency;
    public GetDeviceInfoResponse emergency(DeviceEmergencyInfo emergency)
    {
        this.emergency = emergency;
        return this;
    }

    /**
     */
    public EmergencyServiceAddressResource emergencyServiceAddress;
    public GetDeviceInfoResponse emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress)
    {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    /**
     * Phone lines information
     */
    public PhoneLinesInfo[] phoneLines;
    public GetDeviceInfoResponse phoneLines(PhoneLinesInfo[] phoneLines)
    {
        this.phoneLines = phoneLines;
        return this;
    }

    /**
     */
    public ShippingInfo shipping;
    public GetDeviceInfoResponse shipping(ShippingInfo shipping)
    {
        this.shipping = shipping;
        return this;
    }

    /**
     * Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. Either model  structure, or  boxBillingId  must be specified for HardPhone
     * Format: int64
     */
    public Long boxBillingId;
    public GetDeviceInfoResponse boxBillingId(Long boxBillingId)
    {
        this.boxBillingId = boxBillingId;
        return this;
    }

    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    public GetDeviceInfoResponse useAsCommonPhone(Boolean useAsCommonPhone)
    {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    /**
     * Network location status. &#039;True&#039; if the device is located in the configured corporate network (On-Net); &#039;False&#039; for Off-Net location. Parameter is not returned if `EmergencyAddressAutoUpdate` feature is not enabled for the account/user, or if device network location is not determined
     */
    public Boolean inCompanyNet;
    public GetDeviceInfoResponse inCompanyNet(Boolean inCompanyNet)
    {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    /**
     */
    public DeviceSiteInfo site;
    public GetDeviceInfoResponse site(DeviceSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Datetime of receiving last location report in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z
     */
    public String lastLocationReportTime;
    public GetDeviceInfoResponse lastLocationReportTime(String lastLocationReportTime)
    {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }

    /**
     * Pooling type of a deviceHost - device with standalone paid phone line which can be linked to Glip/Softphone instanceGuest - device with a linked phone lineNone - device without a phone line or with specific line (free, BLA, etc.) = [&#039;Host&#039;, &#039;Guest&#039;, &#039;None&#039;]
     * Enum: Host, Guest, None
     */
    public String linePooling;
    public GetDeviceInfoResponse linePooling(String linePooling)
    {
        this.linePooling = linePooling;
        return this;
    }

    /**
     */
    public BillingStatementInfo billingStatement;
    public GetDeviceInfoResponse billingStatement(BillingStatementInfo billingStatement)
    {
        this.billingStatement = billingStatement;
        return this;
    }
}