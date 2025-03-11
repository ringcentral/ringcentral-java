package com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.pagingonlygroups.Index parent;

    public Index(com.ringcentral.paths.restapi.account.pagingonlygroups.Index parent) {
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
     * Adds and/or removes paging group users and devices.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: Groups
     */
    public String post(EditPagingGroupRequest editPagingGroupRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), editPagingGroupRequest, null);
        return rb.string();
    }
}
