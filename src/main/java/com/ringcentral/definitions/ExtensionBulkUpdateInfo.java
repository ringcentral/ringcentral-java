package com.ringcentral.definitions;


public class ExtensionBulkUpdateInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Enum: Disabled, Enabled, NotActivated, Frozen
     */
    public String status;
    /**
     *
     */
    public ExtensionStatusInfo statusInfo;
    /**
     * Type of suspension
     */
    public String reason;
    /**
     * Free form user comment
     */
    public String comment;
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
     * Additional extension identifier created by partner application
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
    public CostCenterInfo costCenter;
    /**
     *
     */
    public CustomFieldInfo[] customFields;
    /**
     * Hides extension from showing in company directory. Supported for extensions of User type only
     */
    public Boolean hidden;
    /**
     *
     */
    public ProvisioningSiteInfo site;
    /**
     * Extension type. Please note that legacy &#039;Department&#039; extension
     * type corresponds to &#039;Call Queue&#039; extensions in modern RingCentral
     * product terminology
     * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, DelegatedLinesGroup
     */
    public String type;
    /**
     * List of non-RC internal identifiers assigned to an extension
     */
    public ReferenceInfo[] references;

    public ExtensionBulkUpdateInfo id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionBulkUpdateInfo status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionBulkUpdateInfo statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public ExtensionBulkUpdateInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public ExtensionBulkUpdateInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    public ExtensionBulkUpdateInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionBulkUpdateInfo contact(ContactInfoUpdateRequest contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionBulkUpdateInfo regionalSettings(ExtensionRegionalSettingRequest regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionBulkUpdateInfo setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionBulkUpdateInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public ExtensionBulkUpdateInfo ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }

    public ExtensionBulkUpdateInfo password(String password) {
        this.password = password;
        return this;
    }

    public ExtensionBulkUpdateInfo callQueueInfo(CallQueueInfoRequest callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }

    public ExtensionBulkUpdateInfo transition(UserTransitionInfo transition) {
        this.transition = transition;
        return this;
    }

    public ExtensionBulkUpdateInfo costCenter(CostCenterInfo costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public ExtensionBulkUpdateInfo customFields(CustomFieldInfo[] customFields) {
        this.customFields = customFields;
        return this;
    }

    public ExtensionBulkUpdateInfo hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public ExtensionBulkUpdateInfo site(ProvisioningSiteInfo site) {
        this.site = site;
        return this;
    }

    public ExtensionBulkUpdateInfo type(String type) {
        this.type = type;
        return this;
    }

    public ExtensionBulkUpdateInfo references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }
}
