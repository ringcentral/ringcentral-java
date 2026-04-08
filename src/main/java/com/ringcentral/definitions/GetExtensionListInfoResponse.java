package com.ringcentral.definitions;

public class GetExtensionListInfoResponse {
    /** Internal identifier of an extension Format: int64 */
    public Long id;

    public GetExtensionListInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    /** Canonical URI of an extension Format: uri */
    public String uri;

    public GetExtensionListInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public ContactInfo contact;

    public GetExtensionListInfoResponse contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }

    /** Extension short number */
    public String extensionNumber;

    public GetExtensionListInfoResponse extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Extension name. For user extension types the value is a combination of the specified first
     * name and last name
     */
    public String name;

    public GetExtensionListInfoResponse name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public ExtensionPermissions permissions;

    public GetExtensionListInfoResponse permissions(ExtensionPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /** */
    public ProfileImageInfo profileImage;

    public GetExtensionListInfoResponse profileImage(ProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    /**
     * For Partner Applications Internal identifier of an extension created by partner. The
     * RingCentral supports mapping of accounts and stores the corresponding account ID/extension ID
     * for each partner ID of a client application. In request URIs partner IDs are accepted instead
     * of regular RingCentral native IDs as path parameters using `pid=XXX` clause. Though in
     * response URIs contain the corresponding account IDs and extension IDs. In all request and
     * response bodies these values are reflected via partnerId attributes of account and extension
     */
    public String partnerId;

    public GetExtensionListInfoResponse partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /** List of non-RC internal identifiers assigned to an extension */
    public ReferenceInfo[] references;

    public GetExtensionListInfoResponse references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }

    /** Extension status Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned */
    public String status;

    public GetExtensionListInfoResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Type of the extension. For unrecognized types the `Unknown` value is returned. Please note
     * that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039;
     * extensions in modern RingCentral product terminology Example: User Enum: User, Department,
     * Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup,
     * DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension, ProxyAdmin,
     * RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser, TieLine, Unknown
     */
    public String type;

    public GetExtensionListInfoResponse type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Extension subtype, if applicable. For unrecognized subtypes the `Unknown` value is returned
     * Enum: VideoPro, VideoProPlus, DigitalSignageOnlyRooms, Unknown, Emergency
     */
    public String subType;

    public GetExtensionListInfoResponse subType(String subType) {
        this.subType = subType;
        return this;
    }

    /** */
    public CallQueueExtensionInfo callQueueInfo;

    public GetExtensionListInfoResponse callQueueInfo(CallQueueExtensionInfo callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }

    /**
     * Hides extension from showing in company directory. Supported for extensions of User type only
     */
    public Boolean hidden;

    public GetExtensionListInfoResponse hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /** */
    public Roles[] roles;

    public GetExtensionListInfoResponse roles(Roles[] roles) {
        this.roles = roles;
        return this;
    }

    /** */
    public ProvisioningSiteInfo site;

    public GetExtensionListInfoResponse site(ProvisioningSiteInfo site) {
        this.site = site;
        return this;
    }

    /** */
    public AssignedCountryInfo assignedCountry;

    public GetExtensionListInfoResponse assignedCountry(AssignedCountryInfo assignedCountry) {
        this.assignedCountry = assignedCountry;
        return this;
    }

    /** */
    public CostCenterInfo costCenter;

    public GetExtensionListInfoResponse costCenter(CostCenterInfo costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Extension creation date/time, in ISO 8601 format Format: date-time Example: Thu Jun 06 2024
     * 00:01:14 GMT-0700 (Pacific Daylight Time)
     */
    public String creationTime;

    public GetExtensionListInfoResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Alert timer or pickup setting. Delay time in seconds before call queue group members are
     * notified when calls are queued Format: int32 Enum: 5, 10, 15, 20, 30, 45, 60, 120, 180, 240,
     * 300, 360, 420, 480, 540, 600
     */
    public Long alertTimer;

    public GetExtensionListInfoResponse alertTimer(Long alertTimer) {
        this.alertTimer = alertTimer;
        return this;
    }
}
