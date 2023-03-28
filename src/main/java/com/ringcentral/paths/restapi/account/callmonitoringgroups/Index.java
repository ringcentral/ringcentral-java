package com.ringcentral.paths.restapi.account.callmonitoringgroups;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallMonitoringGroup;
import com.ringcentral.definitions.CallMonitoringGroups;
import com.ringcentral.definitions.CreateCallMonitoringGroupRequest;
import com.ringcentral.definitions.ListCallMonitoringGroupsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String groupId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String groupId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.groupId = groupId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && groupId != null) {
            return parent.path() + "/call-monitoring-groups/" + groupId;
        }
        return parent.path() + "/call-monitoring-groups";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of call monitoring groups filtered by an extension.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public CallMonitoringGroups get(ListCallMonitoringGroupsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallMonitoringGroups.class);
    }

    public CallMonitoringGroups get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Creates a new call monitoring group.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: Groups
     */
    public CallMonitoringGroup post(CreateCallMonitoringGroupRequest createCallMonitoringGroupRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createCallMonitoringGroupRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallMonitoringGroup.class);
    }

    /**
     * Updates a call monitoring group name.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: Groups
     */
    public CallMonitoringGroup put(CreateCallMonitoringGroupRequest createCallMonitoringGroupRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (groupId == null) {
            throw new IllegalArgumentException("Parameter groupId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), createCallMonitoringGroupRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallMonitoringGroup.class);
    }

    /**
     * Removes information about a call monitoring group specified in path.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: Groups
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (groupId == null) {
            throw new IllegalArgumentException("Parameter groupId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.callmonitoringgroups.members.Index members() {
        return new com.ringcentral.paths.restapi.account.callmonitoringgroups.members.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign.Index(this);
    }

}
