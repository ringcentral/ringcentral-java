package com.ringcentral.paths.restapi.account.pagingonlygroups.users;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListPagingGroupUsersParameters;
import com.ringcentral.definitions.PagingOnlyGroupUsers;

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

    /**
     * Returns the list of users allowed to page this group.
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
