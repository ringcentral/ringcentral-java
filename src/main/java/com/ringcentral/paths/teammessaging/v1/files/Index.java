package com.ringcentral.paths.teammessaging.v1.files;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateGlipFileNewParameters;
import com.ringcentral.definitions.CreateGlipFileNewRequest;
import com.ringcentral.definitions.TMAddFileRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/files";
    }

    /**
     * Posts a file.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/files
     * Rate Limit Group: Heavy
     * App Permission: TeamMessaging
     */
    public TMAddFileRequest post(CreateGlipFileNewRequest createGlipFileNewRequest, CreateGlipFileNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createGlipFileNewRequest, queryParams, com.ringcentral.ContentType.MULTIPART);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMAddFileRequest.class);
    }

    public TMAddFileRequest post(CreateGlipFileNewRequest createGlipFileNewRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(createGlipFileNewRequest, null);
    }
}
