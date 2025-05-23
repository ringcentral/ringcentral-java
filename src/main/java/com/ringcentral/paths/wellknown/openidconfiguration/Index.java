package com.ringcentral.paths.wellknown.openidconfiguration;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.wellknown.Index parent;

    public Index(com.ringcentral.paths.wellknown.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/openid-configuration";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns OpenID Connect provider configuration.
     * <p>
     * This endpoint follows the [OpenID Connect Discovery 1.0](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata) specification.
     * It provides a mechanism for an OpenID Connect Relying Party to discover the End-User&#039;s OpenID Provider and obtain information
     * needed to interact with it, including its OAuth 2.0 endpoint locations.
     * <p>
     * HTTP Method: get
     * Endpoint: /.well-known/openid-configuration
     * Rate Limit Group: NoThrottling
     */
    public OpenIdDiscovery get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), OpenIdDiscovery.class);
    }
}
