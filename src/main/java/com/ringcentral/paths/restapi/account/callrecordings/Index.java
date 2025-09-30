package com.ringcentral.paths.restapi.account.callrecordings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallRecordingIds;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/call-recordings";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Deletes company call recordings by their IDs. *Please note:* This method deletes the recording file itself,
     * not the record of it in the call log.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recordings
     * Rate Limit Group: Heavy
     * App Permission: EditCallLog
     * User Permission: EditCompanyCallRecordings
     */
    public String delete(CallRecordingIds callRecordingIds) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), callRecordingIds, null);
        return rb.string();
    }
}
