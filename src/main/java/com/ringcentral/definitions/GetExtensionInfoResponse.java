package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionInfoResponse
{
    // Internal identifier of an extension
    public String id;
    public GetExtensionInfoResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an extension
    public String uri;
    public GetExtensionInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Contact detailed information
    public ContactInfo contact;
    public GetExtensionInfoResponse contact(ContactInfo contact) {
        this.contact = contact;
        return this;
    }
    // Information on department extension(s), to which the requested extension belongs. Returned only for user extensions, members of department, requested by single extensionId
    public DepartmentInfo[] departments;
    public GetExtensionInfoResponse departments(DepartmentInfo[] departments) {
        this.departments = departments;
        return this;
    }
    // Number of department extension
    public String extensionNumber;
    public GetExtensionInfoResponse extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Extension user name
    public String name;
    public GetExtensionInfoResponse name(String name) {
        this.name = name;
        return this;
    }
    // For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
    public String partnerId;
    public GetExtensionInfoResponse partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    // Extension permissions, corresponding to the Service Web permissions 'Admin' and 'InternationalCalling'
    public ExtensionPermissions permissions;
    public GetExtensionInfoResponse permissions(ExtensionPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    // Information on profile image
    public ProfileImageInfo profileImage;
    public GetExtensionInfoResponse profileImage(ProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }
    // List of non-RC internal identifiers assigned to an extension
    public ReferenceInfo[] references;
    public GetExtensionInfoResponse references(ReferenceInfo[] references) {
        this.references = references;
        return this;
    }
    // Extension region data (timezone, home country, language)
    public RegionalSettings regionalSettings;
    public GetExtensionInfoResponse regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }
    // Extension service features returned in response only when the logged-in user requests his/her own extension info, see also Extension Service Features
    public ExtensionServiceFeatureInfo[] serviceFeatures;
    public GetExtensionInfoResponse serviceFeatures(ExtensionServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    // Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'
    public String setupWizardState;
    public GetExtensionInfoResponse setupWizardState(String setupWizardState) {
        this.setupWizardState = setupWizardState;
        return this;
    }
    // Extension current state. If the status is 'Unassigned'. Returned for all extensions
    public String status;
    public GetExtensionInfoResponse status(String status) {
        this.status = status;
        return this;
    }
    // Status information (reason, comment). Returned for 'Disabled' status only
    public ExtensionStatusInfo statusInfo;
    public GetExtensionInfoResponse statusInfo(ExtensionStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    // Extension type
    public String type;
    public GetExtensionInfoResponse type(String type) {
        this.type = type;
        return this;
    }
    // For Department extension type only. Call queue settings
    public CallQueueInfo callQueueInfo;
    public GetExtensionInfoResponse callQueueInfo(CallQueueInfo callQueueInfo) {
        this.callQueueInfo = callQueueInfo;
        return this;
    }
}
