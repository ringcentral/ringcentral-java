package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BulkProvisionExtensionResource
{
    //
    public String uri;
    public BulkProvisionExtensionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public BulkProvisionExtensionResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String partnerId;
    public BulkProvisionExtensionResource partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    //
    public String extensionNumber;
    public BulkProvisionExtensionResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String loginName;
    public BulkProvisionExtensionResource loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    //
    public ContactInfo contact;
    public BulkProvisionExtensionResource contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }
    //
    public Reference[] references;
    public BulkProvisionExtensionResource references(Reference[] references) {
        this.references = references;
        return this;
    }
    //
    public String name;
    public BulkProvisionExtensionResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String type;
    public BulkProvisionExtensionResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String status;
    public BulkProvisionExtensionResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public StatusInfo statusInfo;
    public BulkProvisionExtensionResource statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    //
    public DepartmentResource[] departments;
    public BulkProvisionExtensionResource departments(DepartmentResource[] departments) {
        this.departments = departments;
        return this;
    }
    //
    public ServiceFeatureValue[] serviceFeatures;
    public BulkProvisionExtensionResource serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    //
    public RegionalSettingsResource regionalSettings;
    public BulkProvisionExtensionResource regionalSettings(RegionalSettingsResource regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    //
    public String setupWizardState;
    public BulkProvisionExtensionResource setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    //
    public ExtensionPermissionsResource permissions;
    public BulkProvisionExtensionResource permissions(ExtensionPermissionsResource permissions) {
        this.permissions = permissions;
        return this;
    }
    //
    public String password;
    public BulkProvisionExtensionResource password(String password) {
        this.password = password;
        return this;
    }
    //
    public String ivrPin;
    public BulkProvisionExtensionResource ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
    //
    public ProfileImageResource profileImage;
    public BulkProvisionExtensionResource profileImage(ProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }
}
