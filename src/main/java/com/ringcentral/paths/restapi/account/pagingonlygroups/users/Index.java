package com.ringcentral.paths.restapi.account.pagingonlygroups.users;

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
        return parent.path() + "/users";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of users allowed to page this group.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserInfo
     */
    public PagingOnlyGroupUsers get(ListPagingGroupUsersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PagingOnlyGroupUsers.class);
    }

    public PagingOnlyGroupUsers get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
