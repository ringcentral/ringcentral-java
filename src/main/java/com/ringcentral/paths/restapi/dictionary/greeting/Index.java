package com.ringcentral.paths.restapi.dictionary.greeting;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.DictionaryGreetingInfo;
import com.ringcentral.definitions.DictionaryGreetingList;
import com.ringcentral.definitions.ListStandardGreetingsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String greetingId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String greetingId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.greetingId = greetingId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && greetingId != null) {
            return parent.path() + "/greeting/" + greetingId;
        }
        return parent.path() + "/greeting";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of predefined standard greetings. Custom greetings
     * recorded by user are not returned in response to this request. See Get Extension
     * Custom Greetings.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/greeting
     * Rate Limit Group: Medium
     */
    public DictionaryGreetingList list(ListStandardGreetingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DictionaryGreetingList.class);
    }

    public DictionaryGreetingList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a standard greeting by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/greeting/{greetingId}
     * Rate Limit Group: Medium
     */
    public DictionaryGreetingInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (greetingId == null) {
            throw new IllegalArgumentException("Parameter greetingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DictionaryGreetingInfo.class);
    }
}
