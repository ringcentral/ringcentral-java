package com.ringcentral.paths.restapi.account.extension;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String extensionId;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this(parent, "~");
    }

    public Index(com.ringcentral.paths.restapi.account.Index parent, String extensionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.extensionId = extensionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && extensionId != null) {
            return parent.path() + "/extension/" + extensionId;
        }
        return parent.path() + "/extension";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of extensions created for a particular account. All types of extensions are included in this list.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public GetExtensionListResponse list(ListExtensionsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionListResponse.class);
    }

    public GetExtensionListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates an extension.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: AddRemoveUsers
     */
    public ExtensionCreationResponse post(ExtensionCreationRequest extensionCreationRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), extensionCreationRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionCreationResponse.class);
    }

    /**
     * Returns basic information about a particular extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public GetExtensionInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (extensionId == null) {
            throw new IllegalArgumentException("Parameter extensionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionInfoResponse.class);
    }

    /**
     * Updates user settings.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserInfo OR EditUserCredentials
     */
    public GetExtensionInfoResponse put(ExtensionUpdateRequest extensionUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (extensionId == null) {
            throw new IllegalArgumentException("Parameter extensionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), extensionUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionInfoResponse.class);
    }

    /**
     * Deletes extension(s) by ID(s). When an extension is being deleted the default API behaviour is as follows: ⋅⋅* user&#039;s direct numbers are preserved by becoming additional company numbers; ⋅⋅* user&#039;s digital lines (both device &amp; associated phone number) are deleted. You can change this behaviour using the filters: ..* create unassigned extensions for each digital line of the deleted extension by setting the query parameter `savePhoneLines` to `true` in request path; ..* remove direct numbers of the deleted extension by setting the query parameter `savePhoneNumbers` to `false` in request path
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: AddRemoveUsers
     */
    public String delete(DeleteExtensionParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (extensionId == null) {
            throw new IllegalArgumentException("Parameter extensionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), queryParams);
        return rb.string();
    }

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }

    public com.ringcentral.paths.restapi.account.extension.sms.Index sms() {
        return new com.ringcentral.paths.restapi.account.extension.sms.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.mms.Index mms() {
        return new com.ringcentral.paths.restapi.account.extension.mms.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.fax.Index fax() {
        return new com.ringcentral.paths.restapi.account.extension.fax.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.grant.Index grant() {
        return new com.ringcentral.paths.restapi.account.extension.grant.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.device.Index device() {
        return new com.ringcentral.paths.restapi.account.extension.device.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meeting.Index meeting() {
        return this.meeting(null);
    }

    public com.ringcentral.paths.restapi.account.extension.meeting.Index meeting(String meetingId) {
        return new com.ringcentral.paths.restapi.account.extension.meeting.Index(this, meetingId);
    }


    public com.ringcentral.paths.restapi.account.extension.calllog.Index callLog() {
        return this.callLog(null);
    }

    public com.ringcentral.paths.restapi.account.extension.calllog.Index callLog(String callRecordId) {
        return new com.ringcentral.paths.restapi.account.extension.calllog.Index(this, callRecordId);
    }


    public com.ringcentral.paths.restapi.account.extension.greeting.Index greeting() {
        return this.greeting(null);
    }

    public com.ringcentral.paths.restapi.account.extension.greeting.Index greeting(String greetingId) {
        return new com.ringcentral.paths.restapi.account.extension.greeting.Index(this, greetingId);
    }


    public com.ringcentral.paths.restapi.account.extension.ringout.Index ringOut() {
        return this.ringOut(null);
    }

    public com.ringcentral.paths.restapi.account.extension.ringout.Index ringOut(String ringoutId) {
        return new com.ringcentral.paths.restapi.account.extension.ringout.Index(this, ringoutId);
    }


    public com.ringcentral.paths.restapi.account.extension.presence.Index presence() {
        return new com.ringcentral.paths.restapi.account.extension.presence.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.favorite.Index favorite() {
        return new com.ringcentral.paths.restapi.account.extension.favorite.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.features.Index features() {
        return new com.ringcentral.paths.restapi.account.extension.features.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.callerid.Index callerId() {
        return new com.ringcentral.paths.restapi.account.extension.callerid.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.callqueues.Index callQueues() {
        return new com.ringcentral.paths.restapi.account.extension.callqueues.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.addressbook.Index addressBook() {
        return new com.ringcentral.paths.restapi.account.extension.addressbook.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.activecalls.Index activeCalls() {
        return new com.ringcentral.paths.restapi.account.extension.activecalls.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.messagesync.Index messageSync() {
        return new com.ringcentral.paths.restapi.account.extension.messagesync.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.phonenumber.Index phoneNumber() {
        return new com.ringcentral.paths.restapi.account.extension.phonenumber.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.conferencing.Index conferencing() {
        return new com.ringcentral.paths.restapi.account.extension.conferencing.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.messagestore.Index messageStore() {
        return this.messageStore(null);
    }

    public com.ringcentral.paths.restapi.account.extension.messagestore.Index messageStore(String messageId) {
        return new com.ringcentral.paths.restapi.account.extension.messagestore.Index(this, messageId);
    }


    public com.ringcentral.paths.restapi.account.extension.profileimage.Index profileImage() {
        return this.profileImage(null);
    }

    public com.ringcentral.paths.restapi.account.extension.profileimage.Index profileImage(String scaleSize) {
        return new com.ringcentral.paths.restapi.account.extension.profileimage.Index(this, scaleSize);
    }


    public com.ringcentral.paths.restapi.account.extension.calllogsync.Index callLogSync() {
        return new com.ringcentral.paths.restapi.account.extension.calllogsync.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.companypager.Index companyPager() {
        return new com.ringcentral.paths.restapi.account.extension.companypager.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.authzprofile.Index authzProfile() {
        return new com.ringcentral.paths.restapi.account.extension.authzprofile.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.assignedrole.Index assignedRole() {
        return new com.ringcentral.paths.restapi.account.extension.assignedrole.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.answeringrule.Index answeringRule() {
        return this.answeringRule(null);
    }

    public com.ringcentral.paths.restapi.account.extension.answeringrule.Index answeringRule(String ruleId) {
        return new com.ringcentral.paths.restapi.account.extension.answeringrule.Index(this, ruleId);
    }


    public com.ringcentral.paths.restapi.account.extension.businesshours.Index businessHours() {
        return new com.ringcentral.paths.restapi.account.extension.businesshours.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.callerblocking.Index callerBlocking() {
        return new com.ringcentral.paths.restapi.account.extension.callerblocking.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.unifiedpresence.Index unifiedPresence() {
        return new com.ringcentral.paths.restapi.account.extension.unifiedpresence.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.forwardingnumber.Index forwardingNumber() {
        return this.forwardingNumber(null);
    }

    public com.ringcentral.paths.restapi.account.extension.forwardingnumber.Index forwardingNumber(String forwardingNumberId) {
        return new com.ringcentral.paths.restapi.account.extension.forwardingnumber.Index(this, forwardingNumberId);
    }


    public com.ringcentral.paths.restapi.account.extension.addressbooksync.Index addressBookSync() {
        return new com.ringcentral.paths.restapi.account.extension.addressbooksync.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meetingrecordings.Index meetingRecordings() {
        return new com.ringcentral.paths.restapi.account.extension.meetingrecordings.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.administeredsites.Index administeredSites() {
        return new com.ringcentral.paths.restapi.account.extension.administeredsites.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.emergencylocations.Index emergencyLocations() {
        return this.emergencyLocations(null);
    }

    public com.ringcentral.paths.restapi.account.extension.emergencylocations.Index emergencyLocations(String locationId) {
        return new com.ringcentral.paths.restapi.account.extension.emergencylocations.Index(this, locationId);
    }


    public com.ringcentral.paths.restapi.account.extension.callqueuepresence.Index callQueuePresence() {
        return new com.ringcentral.paths.restapi.account.extension.callqueuepresence.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.videoconfiguration.Index videoConfiguration() {
        return new com.ringcentral.paths.restapi.account.extension.videoconfiguration.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index meetingConfiguration() {
        return new com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.notificationsettings.Index notificationSettings() {
        return new com.ringcentral.paths.restapi.account.extension.notificationsettings.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index meetingsConfiguration() {
        return new com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index(this);
    }

}
