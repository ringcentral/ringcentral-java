package com.ringcentral.paths.webinar.configuration.v1.sessions;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RcwConfigListAllSessionsParameters;
import com.ringcentral.definitions.WcsSessionGlobalListResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.configuration.v1.Index parent;

    public Index(com.ringcentral.paths.webinar.configuration.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sessions";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of Webinar Sessions hosted by a current authorized user sorted by
     * &#039;scheduledStartTime&#039; or &#039;creationTime&#039; (if &#039;scheduledStartTime&#039; is not set) in the ascending order
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/configuration/v1/sessions
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public WcsSessionGlobalListResource get(RcwConfigListAllSessionsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsSessionGlobalListResource.class);
    }

    public WcsSessionGlobalListResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
