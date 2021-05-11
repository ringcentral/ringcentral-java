package com.ringcentral.paths.restapi.account.directory.entries.search;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.DirectoryResource;
import com.ringcentral.definitions.SearchDirectoryEntriesRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.directory.entries.Index parent;

    public Index(com.ringcentral.paths.restapi.account.directory.entries.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/search";
    }

    /**
     * Returns contact information on corporate users of federated accounts according to the specified filtering and ordering.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/directory/entries/search
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public DirectoryResource post(SearchDirectoryEntriesRequest searchDirectoryEntriesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), searchDirectoryEntriesRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DirectoryResource.class);
    }
}
