package com.ringcentral.paths.webinar.history.v1.company.sessions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.company.Index parent;

    public Index(com.ringcentral.paths.webinar.history.v1.company.Index parent) {
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
     * Returns the list of historical Webinar Sessions hosted by particular user(s) or all company users
     * sorted by &#039;endTime&#039; in the descending order. Depending on a session status &#039;endTime&#039; can
     * represent actual end time or scheduled end time.
     * The user must have &quot;WebinarSettings&quot; permission granted otherwise the API returns HTTP 403.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/company/sessions
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public SessionGlobalListResource get(RcwHistoryListAllCompanySessionsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SessionGlobalListResource.class);
    }

    public SessionGlobalListResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
