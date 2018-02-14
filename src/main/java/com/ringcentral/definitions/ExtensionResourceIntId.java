package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionResourceIntId
{
    //
    public String uri;
    public ExtensionResourceIntId uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public Long id;
    public ExtensionResourceIntId id(Long id) {
        this.id = id;
        return this;
    }
    //
    public String partnerId;
    public ExtensionResourceIntId partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    //
    public String extensionNumber;
    public ExtensionResourceIntId extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String loginName;
    public ExtensionResourceIntId loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    //
    public ContactInfo contact;
    public ExtensionResourceIntId contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }
    //
    public Reference[] references;
    public ExtensionResourceIntId references(Reference[] references) {
        this.references = references;
        return this;
    }
    //
    public String name;
    public ExtensionResourceIntId name(String name) {
        this.name = name;
        return this;
    }
    //
    public String type;
    public ExtensionResourceIntId type(String type) {
        this.type = type;
        return this;
    }
    //
    public String status;
    public ExtensionResourceIntId status(String status) {
        this.status = status;
        return this;
    }
    //
    public StatusInfo statusInfo;
    public ExtensionResourceIntId statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    //
    public DepartmentResource[] departments;
    public ExtensionResourceIntId departments(DepartmentResource[] departments) {
        this.departments = departments;
        return this;
    }
    //
    public ServiceFeatureValue[] serviceFeatures;
    public ExtensionResourceIntId serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    //
    public RegionalSettingsResource regionalSettings;
    public ExtensionResourceIntId regionalSettings(RegionalSettingsResource regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    //
    public String setupWizardState;
    public ExtensionResourceIntId setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    //
    public ExtensionPermissionsResource permissions;
    public ExtensionResourceIntId permissions(ExtensionPermissionsResource permissions) {
        this.permissions = permissions;
        return this;
    }
    //
    public String password;
    public ExtensionResourceIntId password(String password) {
        this.password = password;
        return this;
    }
    //
    public String ivrPin;
    public ExtensionResourceIntId ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    //
    public ProfileImageResource profileImage;
    public ExtensionResourceIntId profileImage(ProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }
}
