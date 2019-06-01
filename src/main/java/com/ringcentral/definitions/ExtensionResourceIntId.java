package com.ringcentral.definitions;


public class ExtensionResourceIntId {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public Long id;
    /**
     *
     */
    public String partnerId;
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String loginName;
    /**
     *
     */
    public ExtensionContactInfo contact;
    /**
     *
     */
    public Reference[] references;
    /**
     *
     */
    public String name;
    /**
     * Enum: Unknown, User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation
     */
    public String type;
    /**
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String status;
    /**
     *
     */
    public StatusInfo statusInfo;
    /**
     *
     */
    public DepartmentResource[] departments;
    /**
     *
     */
    public ServiceFeatureValue[] serviceFeatures;
    /**
     *
     */
    public RegionalSettingsInfo regionalSettings;
    /**
     * Enum: NotStarted, Incomplete, Completed, Unknown
     */
    public String setupWizardState;
    /**
     *
     */
    public ExtensionPermissionsResource permissions;
    /**
     *
     */
    public String password;
    /**
     *
     */
    public String ivrPin;
    /**
     *
     */
    public ProfileImageResource profileImage;

    public ExtensionResourceIntId uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionResourceIntId id(Long id) {
        this.id = id;
        return this;
    }

    public ExtensionResourceIntId partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public ExtensionResourceIntId extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionResourceIntId loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public ExtensionResourceIntId contact(ExtensionContactInfo contact) {
        this.contact = contact;
        return this;
    }

    public ExtensionResourceIntId references(Reference[] references) {
        this.references = references;
        return this;
    }

    public ExtensionResourceIntId name(String name) {
        this.name = name;
        return this;
    }

    public ExtensionResourceIntId type(String type) {
        this.type = type;
        return this;
    }

    public ExtensionResourceIntId status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionResourceIntId statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public ExtensionResourceIntId departments(DepartmentResource[] departments) {
        this.departments = departments;
        return this;
    }

    public ExtensionResourceIntId serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public ExtensionResourceIntId regionalSettings(RegionalSettingsInfo regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public ExtensionResourceIntId setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public ExtensionResourceIntId permissions(ExtensionPermissionsResource permissions) {
        this.permissions = permissions;
        return this;
    }

    public ExtensionResourceIntId password(String password) {
        this.password = password;
        return this;
    }

    public ExtensionResourceIntId ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }

    public ExtensionResourceIntId profileImage(ProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }

}
