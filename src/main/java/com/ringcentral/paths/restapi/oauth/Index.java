package com.ringcentral.paths.restapi.oauth;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.Index parent;

    public Index(com.ringcentral.paths.restapi.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/oauth";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.oauth.jwks.Index jwks() {
        return new com.ringcentral.paths.restapi.oauth.jwks.Index(this);
    }


    public com.ringcentral.paths.restapi.oauth.token.Index token() {
        return new com.ringcentral.paths.restapi.oauth.token.Index(this);
    }


    public com.ringcentral.paths.restapi.oauth.revoke.Index revoke() {
        return new com.ringcentral.paths.restapi.oauth.revoke.Index(this);
    }


    public com.ringcentral.paths.restapi.oauth.wstoken.Index wstoken() {
        return new com.ringcentral.paths.restapi.oauth.wstoken.Index(this);
    }


    public com.ringcentral.paths.restapi.oauth.userinfo.Index userinfo() {
        return new com.ringcentral.paths.restapi.oauth.userinfo.Index(this);
    }


    public com.ringcentral.paths.restapi.oauth.authorize.Index authorize() {
        return new com.ringcentral.paths.restapi.oauth.authorize.Index(this);
    }

}
