package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionResource
{
    //
    public String uri;
    public ExtensionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public ExtensionResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String partnerId;
    public ExtensionResource partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    //
    public String extensionNumber;
    public ExtensionResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String loginName;
    public ExtensionResource loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    //
    public ContactInfo contact;
    public ExtensionResource contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }
    //
    public Reference[] references;
    public ExtensionResource references(Reference[] references) {
        this.references = references;
        return this;
    }
    //
    public String name;
    public ExtensionResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String type;
    public ExtensionResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String status;
    public ExtensionResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public StatusInfo statusInfo;
    public ExtensionResource statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    //
    public DepartmentResource[] departments;
    public ExtensionResource departments(DepartmentResource[] departments) {
        this.departments = departments;
        return this;
    }
    //
    public ServiceFeatureValue[] serviceFeatures;
    public ExtensionResource serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    //
    public RegionalSettingsResource regionalSettings;
    public ExtensionResource regionalSettings(RegionalSettingsResource regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    //
    public String setupWizardState;
    public ExtensionResource setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    //
    public ExtensionPermissionsResource permissions;
    public ExtensionResource permissions(ExtensionPermissionsResource permissions) {
        this.permissions = permissions;
        return this;
    }
    //
    public String password;
    public ExtensionResource password(String password) {
        this.password = password;
        return this;
    }
    //
    public String ivrPin;
    public ExtensionResource ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    //
    public ProfileImageResource profileImage;
    public ExtensionResource profileImage(ProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }
}
