package com.ringcentral.paths.restapi.account;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetAccountInfoResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.restapi.Index parent) {
        this(parent, "~");
    }

    public Index(com.ringcentral.paths.restapi.Index parent, String accountId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.accountId = accountId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && accountId != null) {
            return parent.path() + "/account/" + accountId;
        }
        return parent.path() + "/account";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns basic information about a particular RingCentral customer account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public GetAccountInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (accountId == null) {
            throw new IllegalArgumentException("Parameter accountId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetAccountInfoResponse.class);
    }

    public com.ringcentral.paths.restapi.account.device.Index device() {
        return this.device(null);
    }

    public com.ringcentral.paths.restapi.account.device.Index device(String deviceId) {
        return new com.ringcentral.paths.restapi.account.device.Index(this, deviceId);
    }


    public com.ringcentral.paths.restapi.account.meeting.Index meeting() {
        return new com.ringcentral.paths.restapi.account.meeting.Index(this);
    }


    public com.ringcentral.paths.restapi.account.a2psms.Index a2pSms() {
        return new com.ringcentral.paths.restapi.account.a2psms.Index(this);
    }


    public com.ringcentral.paths.restapi.account.calllog.Index callLog() {
        return this.callLog(null);
    }

    public com.ringcentral.paths.restapi.account.calllog.Index callLog(String callRecordId) {
        return new com.ringcentral.paths.restapi.account.calllog.Index(this, callRecordId);
    }


    public com.ringcentral.paths.restapi.account.presence.Index presence() {
        return new com.ringcentral.paths.restapi.account.presence.Index(this);
    }


    public com.ringcentral.paths.restapi.account.greeting.Index greeting() {
        return new com.ringcentral.paths.restapi.account.greeting.Index(this);
    }


    public com.ringcentral.paths.restapi.account.analytics.Index analytics() {
        return new com.ringcentral.paths.restapi.account.analytics.Index(this);
    }


    public com.ringcentral.paths.restapi.account.directory.Index directory() {
        return new com.ringcentral.paths.restapi.account.directory.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.Index telephony() {
        return new com.ringcentral.paths.restapi.account.telephony.Index(this);
    }


    public com.ringcentral.paths.restapi.account.recording.Index recording() {
        return this.recording(null);
    }

    public com.ringcentral.paths.restapi.account.recording.Index recording(String recordingId) {
        return new com.ringcentral.paths.restapi.account.recording.Index(this, recordingId);
    }


    public com.ringcentral.paths.restapi.account.extension.Index extension() {
        return this.extension("~");
    }

    public com.ringcentral.paths.restapi.account.extension.Index extension(String extensionId) {
        return new com.ringcentral.paths.restapi.account.extension.Index(this, extensionId);
    }


    public com.ringcentral.paths.restapi.account.templates.Index templates() {
        return this.templates(null);
    }

    public com.ringcentral.paths.restapi.account.templates.Index templates(String templateId) {
        return new com.ringcentral.paths.restapi.account.templates.Index(this, templateId);
    }


    public com.ringcentral.paths.restapi.account.ivrmenus.Index ivrMenus() {
        return this.ivrMenus(null);
    }

    public com.ringcentral.paths.restapi.account.ivrmenus.Index ivrMenus(String ivrMenuId) {
        return new com.ringcentral.paths.restapi.account.ivrmenus.Index(this, ivrMenuId);
    }


    public com.ringcentral.paths.restapi.account.userrole.Index userRole() {
        return this.userRole(null);
    }

    public com.ringcentral.paths.restapi.account.userrole.Index userRole(String roleId) {
        return new com.ringcentral.paths.restapi.account.userrole.Index(this, roleId);
    }


    public com.ringcentral.paths.restapi.account.ivrprompts.Index ivrPrompts() {
        return this.ivrPrompts(null);
    }

    public com.ringcentral.paths.restapi.account.ivrprompts.Index ivrPrompts(String promptId) {
        return new com.ringcentral.paths.restapi.account.ivrprompts.Index(this, promptId);
    }


    public com.ringcentral.paths.restapi.account.callqueues.Index callQueues() {
        return this.callQueues(null);
    }

    public com.ringcentral.paths.restapi.account.callqueues.Index callQueues(String groupId) {
        return new com.ringcentral.paths.restapi.account.callqueues.Index(this, groupId);
    }


    public com.ringcentral.paths.restapi.account.phonenumber.Index phoneNumber() {
        return this.phoneNumber(null);
    }

    public com.ringcentral.paths.restapi.account.phonenumber.Index phoneNumber(String phoneNumberId) {
        return new com.ringcentral.paths.restapi.account.phonenumber.Index(this, phoneNumberId);
    }


    public com.ringcentral.paths.restapi.account.activecalls.Index activeCalls() {
        return new com.ringcentral.paths.restapi.account.activecalls.Index(this);
    }


    public com.ringcentral.paths.restapi.account.serviceinfo.Index serviceInfo() {
        return new com.ringcentral.paths.restapi.account.serviceinfo.Index(this);
    }


    public com.ringcentral.paths.restapi.account.customfields.Index customFields() {
        return this.customFields(null);
    }

    public com.ringcentral.paths.restapi.account.customfields.Index customFields(String fieldId) {
        return new com.ringcentral.paths.restapi.account.customfields.Index(this, fieldId);
    }


    public com.ringcentral.paths.restapi.account.calllogsync.Index callLogSync() {
        return new com.ringcentral.paths.restapi.account.calllogsync.Index(this);
    }


    public com.ringcentral.paths.restapi.account.assignedrole.Index assignedRole() {
        return new com.ringcentral.paths.restapi.account.assignedrole.Index(this);
    }


    public com.ringcentral.paths.restapi.account.answeringrule.Index answeringRule() {
        return this.answeringRule(null);
    }

    public com.ringcentral.paths.restapi.account.answeringrule.Index answeringRule(String ruleId) {
        return new com.ringcentral.paths.restapi.account.answeringrule.Index(this, ruleId);
    }


    public com.ringcentral.paths.restapi.account.businesshours.Index businessHours() {
        return new com.ringcentral.paths.restapi.account.businesshours.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callrecording.Index callRecording() {
        return new com.ringcentral.paths.restapi.account.callrecording.Index(this);
    }


    public com.ringcentral.paths.restapi.account.businessaddress.Index businessAddress() {
        return new com.ringcentral.paths.restapi.account.businessaddress.Index(this);
    }


    public com.ringcentral.paths.restapi.account.pagingonlygroups.Index pagingOnlyGroups() {
        return this.pagingOnlyGroups(null);
    }

    public com.ringcentral.paths.restapi.account.pagingonlygroups.Index pagingOnlyGroups(String pagingOnlyGroupId) {
        return new com.ringcentral.paths.restapi.account.pagingonlygroups.Index(this, pagingOnlyGroupId);
    }


    public com.ringcentral.paths.restapi.account.meetingrecordings.Index meetingRecordings() {
        return new com.ringcentral.paths.restapi.account.meetingrecordings.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencylocations.Index emergencyLocations() {
        return this.emergencyLocations(null);
    }

    public com.ringcentral.paths.restapi.account.emergencylocations.Index emergencyLocations(String locationId) {
        return new com.ringcentral.paths.restapi.account.emergencylocations.Index(this, locationId);
    }


    public com.ringcentral.paths.restapi.account.messagestorereport.Index messageStoreReport() {
        return this.messageStoreReport(null);
    }

    public com.ringcentral.paths.restapi.account.messagestorereport.Index messageStoreReport(String taskId) {
        return new com.ringcentral.paths.restapi.account.messagestorereport.Index(this, taskId);
    }


    public com.ringcentral.paths.restapi.account.extensionbulkupdate.Index extensionBulkUpdate() {
        return new com.ringcentral.paths.restapi.account.extensionbulkupdate.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callmonitoringgroups.Index callMonitoringGroups() {
        return this.callMonitoringGroups(null);
    }

    public com.ringcentral.paths.restapi.account.callmonitoringgroups.Index callMonitoringGroups(String groupId) {
        return new com.ringcentral.paths.restapi.account.callmonitoringgroups.Index(this, groupId);
    }


    public com.ringcentral.paths.restapi.account.addressbookbulkupload.Index addressBookBulkUpload() {
        return new com.ringcentral.paths.restapi.account.addressbookbulkupload.Index(this);
    }


    public com.ringcentral.paths.restapi.account.messagestoreconfiguration.Index messageStoreConfiguration() {
        return new com.ringcentral.paths.restapi.account.messagestoreconfiguration.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index emergencyAddressAutoUpdate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index(this);
    }

}
