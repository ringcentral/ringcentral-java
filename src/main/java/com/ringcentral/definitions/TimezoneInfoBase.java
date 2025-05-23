package com.ringcentral.definitions;


/**
 * Timezone information
 */
public class TimezoneInfoBase {
    /**
     * Internal identifier of a timezone
     */
    public String id;
    /**
     * Short name of a timezone
     */
    public String name;
    /**
     * Meaningful description of the timezone
     */
    public String description;
    /**
     * Time difference (offset) in minutes from Coordinated Universal Time (UTC) that a specific locale follows
     */
    public String bias;

    public TimezoneInfoBase id(String id) {
        this.id = id;
        return this;
    }

    public TimezoneInfoBase name(String name) {
        this.name = name;
        return this;
    }

    public TimezoneInfoBase description(String description) {
        this.description = description;
        return this;
    }

    public TimezoneInfoBase bias(String bias) {
        this.bias = bias;
        return this;
    }
}
