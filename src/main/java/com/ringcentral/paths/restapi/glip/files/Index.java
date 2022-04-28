package com.ringcentral.paths.restapi.glip.files;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateGlipFileParameters;
import com.ringcentral.definitions.CreateGlipFileRequest;
import com.ringcentral.definitions.PostGlipFile;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/files";
    }

    /**
     * Posts a file.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/files
     * Rate Limit Group: Heavy
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public PostGlipFile post(CreateGlipFileRequest createGlipFileRequest, CreateGlipFileParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createGlipFileRequest, queryParams, com.ringcentral.ContentType.MULTIPART);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PostGlipFile.class);
    }

    public PostGlipFile post(CreateGlipFileRequest createGlipFileRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(createGlipFileRequest, null);
    }
}
