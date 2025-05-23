package com.ringcentral.definitions;


public class GetExtensionInfoResponse {
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public GetExtensionAccountInfo account;
    /**
     *
     */
    public ContactInfo contact;
    /**
     *
     */
    public CostCenterInfo costCenter;
    /**
     *
     */
    public CustomFieldInfo[] customFields;
    /**
     * Information on department extension(s), to which the requested
     * extension belongs. Returned only for user extensions, members of
     * department, requested by single extensionId. Please note that
     * legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039;
     * extensions in modern RingCentral product terminology
     */
    public DepartmentInfo[] departments;
    /**
     * Extension short number
     */
    public String extensionNumber;
    /**
     *
     */
    public String[] extensionNumbers;
    /**
     * Extension name. For user extension types the value is a combination
     * of the specified first name and last name
     */
    public String name;
    /**
     * For Partner Applications Internal identifier of an extension
     * created by partner. The RingCentral supports mapping of accounts and
     * stores the corresponding account ID/extension ID for each partner ID of
     * a client application. In request URIs partner IDs are accepted instead
     * of regular RingCentral native IDs as path parameters using `pid=XXX` clause.
     * Though in response URIs contain the corresponding account IDs and extension
     * IDs. In all request and response bodies these values are reflected via
     * partnerId attributes of account and extension
     */
    public String partnerId;
    /**
     *
     */
    public ExtensionPermissions permissions;
    /**
     *
     */
    public ProfileImageInfo profileImage;
    /**
     * List of non-RC internal identifiers assigned to an extension
     */
    public ReferenceInfo[] references;
    /**
     *
     */
    public Roles[] roles;
    /**
     *
     */
    public RegionalSettings regionalSettings;
    /**
     * Extension service features is returned in response only when the
     * logged-in user requests their own extension info, see also Extension
     * Service Features
     */
    public ExtensionServiceFeatureInfo[] serviceFeatures;
    /**
     * Initial configuration wizard state
     * Default: NotStarted
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;
    /**
     * Extension status
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String status;
    /**
     *
     */
    public ExtensionStatusInfo statusInfo;
    /**
     * Type of the extension.
     * For unrecognized types the `Unknown` value is returned
     * Example: User
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension, ProxyAdmin, RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser, Unknown
     */
    public String type;
    /**
     * Extension subtype, if applicable.
     * For unrecognized subtypes the `Unknown` value is returned
     * Enum: VideoPro, VideoProPlus, DigitalSignage, Unknown, Emergency
     */
    public String subType;
    /**
     *
     */
    public CallQueueExtensionInfo callQueueInfo;
    /**
     * Hides extension from showing in company directory. Supported for
     * extensions of User type only
     */
    public Boolean hidden;
    /**
     *
     */
    public ProvisioningSiteInfo site;
    /**
     *
     */
    public AssignedCountryInfo assignedCountry;
    /**
     * Extension creation date/time, in ISO 8601 format
     * Format: date-time
     * Example: Thu Jun 06 2024 00:01:14 GMT-0700 (Pacific Daylight Time)
     */
    public String creationTime;
    /**
     * Site access status for cross-site limitation
     * Enum: Limited, Unlimited
     */
    public String siteAccess;
    /**
     * Alert timer or pickup setting. Delay time in seconds before call queue group members are notified when calls are queued
     * Format: int32
     * Enum: 5, 10, 15, 20, 30, 45, 60, 120, 180, 240, 300, 360, 420, 480, 540, 600
     */
    public Long alertTimer;

    public GetExtensionInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetExtensionInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionInfoResponse account(GetExtensionAccountInfo account) {
        this.account = account;
        return this;
    }

    public GetExtensionInfoResponse contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }

    public GetExtensionInfoResponse costCenter(CostCenterInfo costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public GetExtensionInfoResponse customFields(CustomFieldInfo[] customFields) {
        this.customFields = customFields;
        return this;
    }

    public GetExtensionInfoResponse departments(DepartmentInfo[] departments) {
        this.departments = departments;
        return this;
    }

    public GetExtensionInfoResponse extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public GetExtensionInfoResponse extensionNumbers(String[] extensionNumbers) {
        this.extensionNumbers = extensionNumbers;
        return this;
    }

    public GetExtensionInfoResponse name(String name) {
        this.name = name;
        return this;
    }

    public GetExtensionInfoResponse partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public GetExtensionInfoResponse permissions(ExtensionPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    public GetExtensionInfoResponse profileImage(ProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public GetExtensionInfoResponse references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }

    public GetExtensionInfoResponse roles(Roles[] roles) {
        this.roles = roles;
        return this;
    }

    public GetExtensionInfoResponse regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public GetExtensionInfoResponse serviceFeatures(ExtensionServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public GetExtensionInfoResponse setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public GetExtensionInfoResponse status(String status) {
        this.status = status;
        return this;
    }

    public GetExtensionInfoResponse statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public GetExtensionInfoResponse type(String type) {
        this.type = type;
        return this;
    }

    public GetExtensionInfoResponse subType(String subType) {
        this.subType = subType;
        return this;
    }

    public GetExtensionInfoResponse callQueueInfo(CallQueueExtensionInfo callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }

    public GetExtensionInfoResponse hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public GetExtensionInfoResponse site(ProvisioningSiteInfo site) {
        this.site = site;
        return this;
    }

    public GetExtensionInfoResponse assignedCountry(AssignedCountryInfo assignedCountry) {
        this.assignedCountry = assignedCountry;
        return this;
    }

    public GetExtensionInfoResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GetExtensionInfoResponse siteAccess(String siteAccess) {
        this.siteAccess = siteAccess;
        return this;
    }

    public GetExtensionInfoResponse alertTimer(Long alertTimer) {
        this.alertTimer = alertTimer;
        return this;
    }
}
