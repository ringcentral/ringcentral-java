package com.ringcentral.definitions;

/** Timezone information */
public class TimezoneInfoBase {
    /** Canonical URI of a timezone Format: uri */
    public String uri;

    public TimezoneInfoBase uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Internal identifier of a timezone */
    public String id;

    public TimezoneInfoBase id(String id) {
        this.id = id;
        return this;
    }

    /** Short name of a timezone */
    public String name;

    public TimezoneInfoBase name(String name) {
        this.name = name;
        return this;
    }

    /** Meaningful description of the timezone */
    public String description;

    public TimezoneInfoBase description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Time difference (offset) in minutes from Coordinated Universal Time (UTC) that a specific
     * locale follows
     */
    public String bias;

    public TimezoneInfoBase bias(String bias) {
        this.bias = bias;
        return this;
    }
}
