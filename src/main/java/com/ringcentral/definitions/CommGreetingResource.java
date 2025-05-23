package com.ringcentral.definitions;


public class CommGreetingResource {
    /**
     * Greeting type
     * Required
     * Enum: Custom, Preset
     */
    public String effectiveGreetingType;
    /**
     * Required
     */
    public CommGreetingIdResource preset;
    /**
     *
     */
    public CommGreetingIdResource custom;

    public CommGreetingResource effectiveGreetingType(String effectiveGreetingType) {
        this.effectiveGreetingType = effectiveGreetingType;
        return this;
    }

    public CommGreetingResource preset(CommGreetingIdResource preset) {
        this.preset = preset;
        return this;
    }

    public CommGreetingResource custom(CommGreetingIdResource custom) {
        this.custom = custom;
        return this;
    }
}
