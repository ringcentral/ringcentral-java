package com.ringcentral.definitions;


public class GetExtensionListInfoResponse {
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
    public ContactInfo contact;
    /**
     * Extension short number
     */
    public String extensionNumber;
    /**
     * Extension name. For user extension types the value is a combination
     * of the specified first name and last name
     */
    public String name;
    /**
     *
     */
    public ExtensionPermissions permissions;
    /**
     *
     */
    public ProfileImageInfo profileImage;
    /**
     * Extension status
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String status;
    /**
     * Extension type. Please note that legacy `Department` extension type
     * corresponds to &#039;Call Queue&#039; extensions in modern RingCentral product
     * terminology
     * Enum: User, FaxUser, FlexibleUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Bot, Room, Limited, Site, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup
     */
    public String type;
    /**
     * Extension subtype, if applicable. For any unsupported subtypes the
     * `Unknown` value will be returned
     * Enum: VideoPro, VideoProPlus, DigitalSignage, Unknown, Emergency
     */
    public String subType;
    /**
     *
     */
    public CallQueueExtensionInfo callQueueInfo;
    /**
     * Hides extension from showing in company directory.
     * Supported for extensions of User type only
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
     *
     */
    public CostCenterInfo costCenter;
    /**
     * Extension creation date/time, in ISO 8601 format
     * Format: date-time
     * Example: 2024-06-06T07:01:14.123Z
     */
    public String creationTime;

    public GetExtensionListInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetExtensionListInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionListInfoResponse contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }

    public GetExtensionListInfoResponse extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public GetExtensionListInfoResponse name(String name) {
        this.name = name;
        return this;
    }

    public GetExtensionListInfoResponse permissions(ExtensionPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    public GetExtensionListInfoResponse profileImage(ProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public GetExtensionListInfoResponse status(String status) {
        this.status = status;
        return this;
    }

    public GetExtensionListInfoResponse type(String type) {
        this.type = type;
        return this;
    }

    public GetExtensionListInfoResponse subType(String subType) {
        this.subType = subType;
        return this;
    }

    public GetExtensionListInfoResponse callQueueInfo(CallQueueExtensionInfo callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }

    public GetExtensionListInfoResponse hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public GetExtensionListInfoResponse site(ProvisioningSiteInfo site) {
        this.site = site;
        return this;
    }

    public GetExtensionListInfoResponse assignedCountry(AssignedCountryInfo assignedCountry) {
        this.assignedCountry = assignedCountry;
        return this;
    }

    public GetExtensionListInfoResponse costCenter(CostCenterInfo costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public GetExtensionListInfoResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
}
