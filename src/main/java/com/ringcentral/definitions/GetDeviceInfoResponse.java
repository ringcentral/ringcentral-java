package com.ringcentral.definitions;


public class GetDeviceInfoResponse {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Canonical URI of a device
     */
    public String uri;
    /**
     * Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example 'HP-56-2-2'
     */
    public String sku;
    /**
     * Device type
     * Default: HardPhone
     * Enum: BLA, SoftPhone, OtherPhone, HardPhone, WebPhone, Paging
     */
    public String type;
    /**
     * Device name. Mandatory if ordering  SoftPhone  or  OtherPhone. Optional for  HardPhone. If not specified for HardPhone, then device model name is used as device name
     */
    public String name;
    /**
     * Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
     */
    public String serial;
    /**
     * Device status
     * Enum: Offline, Online
     */
    public String status;
    /**
     * PC name for softphone
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
     * Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. EitherT? model  structure, or  boxBillingId  must be specified forT?HardPhone
     */
    public Long boxBillingId;
    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;
    /**
     * Network location status. 'True' if the device is located in the configured corporate network (On-Net); 'False' for Off-Net location. Parameter is not returned if `EmergencyAddressAutoUpdate` feature is not enabled for the account/user, or if device network location is not determined
     */
    public Boolean inCompanyNet;
    /**
     *
     */
    public DeviceSiteInfo site;
    /**
     * Datetime of receiving last location report in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z
     */
    public String lastLocationReportTime;
    /**
     * Pooling type of a deviceHost - device with standalone paid phone line which can be linked to Glip/Softphone instanceGuest - device with a linked phone lineNone - device without a phone line or with specific line (free, BLA, etc.) = ['Host', 'Guest', 'None']
     * Enum: Host, Guest, None
     */
    public String linePooling;
    /**
     *
     */
    public BillingStatementInfo billingStatement;

    public GetDeviceInfoResponse id(String id) {
        this.id = id;
        return this;
    }

    public GetDeviceInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetDeviceInfoResponse sku(String sku) {
        this.sku = sku;
        return this;
    }

    public GetDeviceInfoResponse type(String type) {
        this.type = type;
        return this;
    }

    public GetDeviceInfoResponse name(String name) {
        this.name = name;
        return this;
    }

    public GetDeviceInfoResponse serial(String serial) {
        this.serial = serial;
        return this;
    }

    public GetDeviceInfoResponse status(String status) {
        this.status = status;
        return this;
    }

    public GetDeviceInfoResponse computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    public GetDeviceInfoResponse model(ModelInfo model) {
        this.model = model;
        return this;
    }

    public GetDeviceInfoResponse extension(ExtensionInfoIntId extension) {
        this.extension = extension;
        return this;
    }

    public GetDeviceInfoResponse emergency(DeviceEmergencyInfo emergency) {
        this.emergency = emergency;
        return this;
    }

    public GetDeviceInfoResponse emergencyServiceAddress(EmergencyServiceAddressResource emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public GetDeviceInfoResponse phoneLines(PhoneLinesInfo[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }

    public GetDeviceInfoResponse shipping(ShippingInfo shipping) {
        this.shipping = shipping;
        return this;
    }

    public GetDeviceInfoResponse boxBillingId(Long boxBillingId) {
        this.boxBillingId = boxBillingId;
        return this;
    }

    public GetDeviceInfoResponse useAsCommonPhone(Boolean useAsCommonPhone) {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

    public GetDeviceInfoResponse inCompanyNet(Boolean inCompanyNet) {
        this.inCompanyNet = inCompanyNet;
        return this;
    }

    public GetDeviceInfoResponse site(DeviceSiteInfo site) {
        this.site = site;
        return this;
    }

    public GetDeviceInfoResponse lastLocationReportTime(String lastLocationReportTime) {
        this.lastLocationReportTime = lastLocationReportTime;
        return this;
    }

    public GetDeviceInfoResponse linePooling(String linePooling) {
        this.linePooling = linePooling;
        return this;
    }

    public GetDeviceInfoResponse billingStatement(BillingStatementInfo billingStatement) {
        this.billingStatement = billingStatement;
        return this;
    }
}
