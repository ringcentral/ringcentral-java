package com.ringcentral.paths.restapi.account.extension.presence;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetPresenceInfo;
import com.ringcentral.definitions.PresenceInfoRequest;
import com.ringcentral.definitions.PresenceInfoResponse;
import com.ringcentral.definitions.ReadUserPresenceStatusParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/presence";
    }

    /**
     * Returns presence status of an extension or several extensions by their ID(s). Batch request is supported. The &#039;presenceStatus&#039; is returned as Offline (the parameters &#039;telephonyStatus&#039;, &#039;message&#039;, &#039;userStatus&#039; and &#039;dndStatus&#039; are not returned at all) for the following extension types: Department/Announcement Only/Take Messages Only (Voicemail)/Fax User/Paging Only Group/Shared Lines Group/IVR Menu/Application Extension/Park Location.If the user requests his/her own presence status, the response contains actual presence status even if the status publication is turned off. Batch request is supported. For batch requests the number of extensions in one request is limited to 30. If more extensions are included in the request, the error code 400 Bad Request is returned with the logical error code InvalidMultipartRequest and the corresponding message &#039;Extension Presence Info multipart request is limited to 30 extensions&#039;.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/presence
     * Rate Limit Group: Light
     * App Permission: ReadPresence
     * User Permission: ReadPresenceStatus
     */
    public GetPresenceInfo get(ReadUserPresenceStatusParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetPresenceInfo.class);
    }

    public GetPresenceInfo get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates user-defined extension presence status, status message and DnD status by extension ID. Supported for regular User extensions only. The extension types listed do not support presence status: Department, Announcement Only, Take Messages Only (Voicemail), Fax User, Paging Only Group, Shared Lines Group, IVR Menu, Application Extension.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/presence
     * Rate Limit Group: Medium
     * App Permission: EditPresence
     */
    public PresenceInfoResponse put(PresenceInfoRequest presenceInfoRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), presenceInfoRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PresenceInfoResponse.class);
    }
}
