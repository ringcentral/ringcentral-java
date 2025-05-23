package com.ringcentral.paths.rcvideo.v1.history.account;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.history.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.rcvideo.v1.history.Index parent, String accountId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.accountId = accountId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && accountId != null) {
            return parent.path() + "/account/" + accountId;
        }
        return parent.path() + "/account";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.rcvideo.v1.history.account.meetings.Index meetings() {
        return new com.ringcentral.paths.rcvideo.v1.history.account.meetings.Index(this);
    }

}
