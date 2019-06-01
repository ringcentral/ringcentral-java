package com.ringcentral.definitions;


public class PhoneNumberExtensionInfo {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String id;
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

    public PhoneNumberExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PhoneNumberExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public PhoneNumberExtensionInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public PhoneNumberExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public PhoneNumberExtensionInfo loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public PhoneNumberExtensionInfo contact(ExtensionContactInfo contact) {
        this.contact = contact;
        return this;
    }

    public PhoneNumberExtensionInfo references(Reference[] references) {
        this.references = references;
        return this;
    }

    public PhoneNumberExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    public PhoneNumberExtensionInfo type(String type) {
        this.type = type;
        return this;
    }

    public PhoneNumberExtensionInfo status(String status) {
        this.status = status;
        return this;
    }

    public PhoneNumberExtensionInfo statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public PhoneNumberExtensionInfo departments(DepartmentResource[] departments) {
        this.departments = departments;
        return this;
    }

    public PhoneNumberExtensionInfo serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public PhoneNumberExtensionInfo regionalSettings(RegionalSettingsInfo regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public PhoneNumberExtensionInfo setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }

    public PhoneNumberExtensionInfo permissions(ExtensionPermissionsResource permissions) {
        this.permissions = permissions;
        return this;
    }

    public PhoneNumberExtensionInfo password(String password) {
        this.password = password;
        return this;
    }

    public PhoneNumberExtensionInfo ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }

    public PhoneNumberExtensionInfo profileImage(ProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }

}
