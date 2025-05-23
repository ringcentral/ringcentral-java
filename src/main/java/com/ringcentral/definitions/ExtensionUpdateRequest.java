package com.ringcentral.definitions;


public class ExtensionUpdateRequest {
    /**
     * Extension status
     * Enum: Enabled, Disabled, Frozen, NotActivated
     */
    public String status;
    /**
     *
     */
    public ExtensionStatusInfo statusInfo;
    /**
     * Extension number available
     */
    public String extensionNumber;
    /**
     *
     */
    public ContactInfoUpdateRequest contact;
    /**
     *
     */
    public ExtensionRegionalSettingRequest regionalSettings;
    /**
     * Initial configuration wizard state
     * Default: NotStarted
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;
    /**
     * Additional extension identifier, created by partner application
     * and applied on client side
     */
    public String partnerId;
    /**
     * IVR PIN
     */
    public String ivrPin;
    /**
     * Password for extension
     */
    public String password;
    /**
     *
     */
    public CallQueueInfoRequest callQueueInfo;
    /**
     *
     */
    public UserTransitionInfo transition;
    /**
     *
     */
    public CustomFieldInfo[] customFields;
    /**
     *
     */
    public SiteReference site;
    /**
     * Extension type. Please note that legacy &#039;Department&#039; extension
     * type corresponds to &#039;Call Queue&#039; extensions in modern RingCentral
     * product terminology
     * Enum: User, FaxUser, FlexibleUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, DelegatedLinesGroup, GroupCallPickup
     */
    public String type;
    /**
     * Extension subtype, if applicable.
     * For unrecognized subtypes the `Unknown` value is returned
     * Enum: VideoPro, VideoProPlus, DigitalSignage, Unknown, Emergency
     */
    public String subType;
    /**
     * List of non-RC internal identifiers assigned to an extension
     */
    public ReferenceInfo[] references;

    public ExtensionUpdateRequest status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionUpdateRequest statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public ExtensionUpdateRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionUpdateRequest contact(ContactInfoUpdateRequest contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionUpdateRequest regionalSettings(ExtensionRegionalSettingRequest regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionUpdateRequest setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionUpdateRequest partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public ExtensionUpdateRequest ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }

    public ExtensionUpdateRequest password(String password) {
        this.password = password;
        return this;
    }

    public ExtensionUpdateRequest callQueueInfo(CallQueueInfoRequest callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }

    public ExtensionUpdateRequest transition(UserTransitionInfo transition) {
        this.transition = transition;
        return this;
    }

    public ExtensionUpdateRequest customFields(CustomFieldInfo[] customFields) {
        this.customFields = customFields;
        return this;
    }

    public ExtensionUpdateRequest site(SiteReference site) {
        this.site = site;
        return this;
    }

    public ExtensionUpdateRequest type(String type) {
        this.type = type;
        return this;
    }

    public ExtensionUpdateRequest subType(String subType) {
        this.subType = subType;
        return this;
    }

    public ExtensionUpdateRequest references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }
}
