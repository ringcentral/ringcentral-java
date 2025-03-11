package com.ringcentral.paths.restapi;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public String apiVersion;

    public Index(RestClient rc) {
        this(rc, "v1.0");
    }

    public Index(RestClient rc, String apiVersion) {
        this.rc = rc;
        this.apiVersion = apiVersion;
    }

    public String path(Boolean withParameter) {
        if (withParameter && apiVersion != null) {
            return "" + "/restapi/" + apiVersion;
        }
        return "" + "/restapi";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns current API version(s) and server info.
     * HTTP Method: get
     * Endpoint: /restapi
     * Rate Limit Group: NoThrottling
     */
    public ApiVersionsList list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ApiVersionsList.class);
    }

    /**
     * Returns current API version info by apiVersion.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}
     * Rate Limit Group: NoThrottling
     */
    public ApiVersionInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ApiVersionInfo.class);
    }

    public com.ringcentral.paths.restapi.v2.Index v2() {
        return new com.ringcentral.paths.restapi.v2.Index(this);
    }


    public com.ringcentral.paths.restapi.oauth.Index oauth() {
        return new com.ringcentral.paths.restapi.oauth.Index(this);
    }


    public com.ringcentral.paths.restapi.account.Index account() {
        return this.account("~");
    }

    public com.ringcentral.paths.restapi.account.Index account(String accountId) {
        return new com.ringcentral.paths.restapi.account.Index(this, accountId);
    }


    public com.ringcentral.paths.restapi.dictionary.Index dictionary() {
        return new com.ringcentral.paths.restapi.dictionary.Index(this);
    }


    public com.ringcentral.paths.restapi.clientinfo.Index clientInfo() {
        return new com.ringcentral.paths.restapi.clientinfo.Index(this);
    }


    public com.ringcentral.paths.restapi.subscription.Index subscription() {
        return this.subscription(null);
    }

    public com.ringcentral.paths.restapi.subscription.Index subscription(String subscriptionId) {
        return new com.ringcentral.paths.restapi.subscription.Index(this, subscriptionId);
    }


    public com.ringcentral.paths.restapi.numberparser.Index numberParser() {
        return new com.ringcentral.paths.restapi.numberparser.Index(this);
    }

}
