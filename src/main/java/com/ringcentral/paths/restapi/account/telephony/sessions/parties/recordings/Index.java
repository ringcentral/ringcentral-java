package com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;
    public String recordingId;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent, String recordingId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.recordingId = recordingId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && recordingId != null) {
            return parent.path() + "/recordings/" + recordingId;
        }
        return parent.path() + "/recordings";
    }

    public String path() {
        return path(true);
    }

    /**
     * Starts a new call recording for a call party.
     * *Please note* this API does not allow conference calls to be recorded.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), null);
        return rb.string();
    }

    /**
     * Pause/resume recording
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/recordings/{recordingId}
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallRecording patch(CallRecordingUpdate callRecordingUpdate, PauseResumeCallRecordingParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (recordingId == null) {
            throw new IllegalArgumentException("Parameter recordingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), callRecordingUpdate, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallRecording.class);
    }

    public CallRecording patch(CallRecordingUpdate callRecordingUpdate) throws com.ringcentral.RestException, java.io.IOException {
        return this.patch(callRecordingUpdate, null);
    }
}
