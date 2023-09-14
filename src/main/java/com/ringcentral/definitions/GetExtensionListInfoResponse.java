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
     * Number of an extension
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
     * Extension current state. If &#039;Unassigned&#039; is specified, then
     * extensions without ‘extensionNumber’ are returned. If not specified,
     * then all extensions are returned
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String status;
    /**
     * Extension type. Please note that legacy &#039;Department&#039; extension type
     * corresponds to &#039;Call Queue&#039; extensions in modern RingCentral product
     * terminology
     * Enum: User, FaxUser, FlexibleUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Bot, Room, Limited, Site, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup
     */
    public String type;
    /**
     * Extension sub-type, if applicable. For any unsupported sub-types the
     * &#039;Unknown&#039; value will be returned&quot;
     * Enum: VideoPro, VideoProPlus, DigitalSignage, Unknown
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
}
