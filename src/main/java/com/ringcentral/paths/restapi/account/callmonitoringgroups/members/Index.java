package com.ringcentral.paths.restapi.account.callmonitoringgroups.members;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallMonitoringGroupMemberList;
import com.ringcentral.definitions.ListCallMonitoringGroupMembersParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.callmonitoringgroups.Index parent;

    public Index(com.ringcentral.paths.restapi.account.callmonitoringgroups.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/members";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of members for a call monitoring group specified in path.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}/members
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public CallMonitoringGroupMemberList get(ListCallMonitoringGroupMembersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallMonitoringGroupMemberList.class);
    }

    public CallMonitoringGroupMemberList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
