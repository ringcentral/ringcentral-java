package com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.callmonitoringgroups.Index parent;

    public Index(com.ringcentral.paths.restapi.account.callmonitoringgroups.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-assign";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Updates a list of call monitoring groups.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: EditExtensions
     * User Permission: Groups
     */
    public String post(CallMonitoringBulkAssign callMonitoringBulkAssign) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), callMonitoringBulkAssign, null);
        return rb.string();
    }
}
