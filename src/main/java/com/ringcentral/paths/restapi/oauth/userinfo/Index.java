package com.ringcentral.paths.restapi.oauth.userinfo;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.UserInfoResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/userinfo";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * OpenID Connect User Info endpoint, as defined by [OpenID Connect Core 1.0](https://openid.net/specs/openid-connect-core-1_0.html#UserInfo) specification.
     * It returns Claims about the authenticated End-User.
     * <p>
     * This is the version that uses HTTP `GET` method.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/oauth/userinfo
     * Rate Limit Group: Auth
     */
    public UserInfoResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserInfoResource.class);
    }
}
