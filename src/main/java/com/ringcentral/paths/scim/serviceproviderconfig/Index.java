package com.ringcentral.paths.scim.serviceproviderconfig;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ServiceProviderConfig;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.scim.Index parent;

    public Index(com.ringcentral.paths.scim.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/ServiceProviderConfig";
    }

    /**
     * Get Service Provider Config
     * HTTP Method: get
     * Endpoint: /scim/{version}/ServiceProviderConfig
     * Rate Limit Group: NoThrottling
     */
    public ServiceProviderConfig get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ServiceProviderConfig.class);
    }
}
