package com.ringcentral.paths.restapi.dictionary.timezone;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetTimezoneInfoResponse;
import com.ringcentral.definitions.GetTimezoneListResponse;
import com.ringcentral.definitions.ListTimezonesParameters;
import com.ringcentral.definitions.ReadTimezoneParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String timezoneId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String timezoneId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.timezoneId = timezoneId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && timezoneId != null) {
            return parent.path() + "/timezone/" + timezoneId;
        }
        return parent.path() + "/timezone";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns all available timezones.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/timezone
     * Rate Limit Group: Light
     */
    public GetTimezoneListResponse list(ListTimezonesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetTimezoneListResponse.class);
    }

    public GetTimezoneListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns information on a certain timezone.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/timezone/{timezoneId}
     * Rate Limit Group: Light
     */
    public GetTimezoneInfoResponse get(ReadTimezoneParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (timezoneId == null) {
            throw new IllegalArgumentException("Parameter timezoneId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetTimezoneInfoResponse.class);
    }

    public GetTimezoneInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
