package com.ringcentral.definitions;


public class GetTimezoneInfoResponse {
    /**
     * Internal identifier of a timezone
     */
    public String id;
    /**
     * Canonical URI of a timezone
     * Format: uri
     */
    public String uri;
    /**
     * Short name of a timezone
     */
    public String name;
    /**
     * Description of a timezone
     */
    public String description;
    /**
     *
     */
    public String bias;

    public GetTimezoneInfoResponse id(String id) {
        this.id = id;
        return this;
    }

    public GetTimezoneInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetTimezoneInfoResponse name(String name) {
        this.name = name;
        return this;
    }

    public GetTimezoneInfoResponse description(String description) {
        this.description = description;
        return this;
    }

    public GetTimezoneInfoResponse bias(String bias) {
        this.bias = bias;
        return this;
    }
}
