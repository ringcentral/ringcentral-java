package com.ringcentral.paths.restapi.v2.numberparser.parse;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.numberparser.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.numberparser.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/parse";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Parses, formats, and validates phone numbers provided as a list of strings. HTTP Method: post
     * Endpoint: /restapi/v2/number-parser/parse Rate Limit Group: Light
     */
    public ParsePhoneNumberResponseV2 post(ParsePhoneNumbersRequest parsePhoneNumbersRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), parsePhoneNumbersRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ParsePhoneNumberResponseV2.class);
    }
}
