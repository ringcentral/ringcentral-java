package com.ringcentral.paths.restapi.dictionary.location;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetLocationListResponse;
import com.ringcentral.definitions.ListLocationsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/location";
    }

    /**
     * Returns all available locations for a certain state.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/location
     * Rate Limit Group: Light
     */
    public GetLocationListResponse get(ListLocationsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetLocationListResponse.class);
    }

    public GetLocationListResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
