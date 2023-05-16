package com.ringcentral.definitions;


public class ExtensionCreationResponse {
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
     * Cost center information
     */
    public ExtensionCreationResponseCostCenter costCenter;
    /**
     *
     */
    public CustomFieldInfo[] customFields;
    /**
     * Extension number
     */
    public String extensionNumber;
    /**
     * Extension name. For user extension types the value is a combination
     * of the specified first name and last name
     */
    public String name;
    /**
     * For Partner Applications Internal identifier of an extension
     * created by partner. The RingCentral supports the mapping of accounts and
     * stores the corresponding account ID/extension ID for each partner ID of
     * a client application. In request URIs partner IDs are accepted instead
     * of regular RingCentral native IDs as path parameters using pid = XXX clause.
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
    public RegionalSettings regionalSettings;
    /**
     * Extension service features returned in response only when the
     * logged-in user requests his/her own extension info, see also Extension
     * Service Features
     */
    public ExtensionServiceFeatureInfo[] serviceFeatures;
    /**
     * Specifies extension configuration wizard state (web service
     * setup). The default value is &#039;NotStarted&#039;
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;
    /**
     *
     */
    public ProvisioningSiteInfo site;
    /**
     * Extension current state. If &#039;Unassigned&#039; is specified, then
     * extensions without ‘extensionNumber’ are returned. If not specified, then
     * all extensions are returned
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String status;
    /**
     *
     */
    public ExtensionStatusInfo statusInfo;
    /**
     * Extension type. Please note that legacy &#039;Department&#039; extension type
     * corresponds to &#039;Call Queue&#039; extensions in modern RingCentral product terminology
     * Enum: User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, Limited
     */
    public String type;
    /**
     * Hides an extension from showing in company directory. Supported
     * for extensions of &#039;User&#039; type only
     */
    public Boolean hidden;

    public ExtensionCreationResponse id(Long id) {
        this.id = id;
        return this;
    }

    public ExtensionCreationResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionCreationResponse contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionCreationResponse costCenter(ExtensionCreationResponseCostCenter costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public ExtensionCreationResponse customFields(CustomFieldInfo[] customFields) {
        this.customFields = customFields;
        return this;
    }

    public ExtensionCreationResponse extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionCreationResponse name(String name) {
        this.name = name;
        return this;
    }

    public ExtensionCreationResponse partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public ExtensionCreationResponse permissions(ExtensionPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    public ExtensionCreationResponse profileImage(ProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public ExtensionCreationResponse references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }

    public ExtensionCreationResponse regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionCreationResponse serviceFeatures(ExtensionServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public ExtensionCreationResponse setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionCreationResponse site(ProvisioningSiteInfo site) {
        this.site = site;
        return this;
    }

    public ExtensionCreationResponse status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionCreationResponse statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public ExtensionCreationResponse type(String type) {
        this.type = type;
        return this;
    }

    public ExtensionCreationResponse hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
}
