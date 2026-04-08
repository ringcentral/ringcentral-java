package com.ringcentral.definitions;


public class CommGreetingResource
{
    /**
     * Greeting type
     * Required
     * Enum: Custom, Preset
     */
    public String effectiveGreetingType;
    public CommGreetingResource effectiveGreetingType(String effectiveGreetingType)
    {
        this.effectiveGreetingType = effectiveGreetingType;
        return this;
    }

    /**
     * Required
     */
    public CommGreetingIdResource preset;
    public CommGreetingResource preset(CommGreetingIdResource preset)
    {
        this.preset = preset;
        return this;
    }

    /**
     */
    public CommGreetingIdResource custom;
    public CommGreetingResource custom(CommGreetingIdResource custom)
    {
        this.custom = custom;
        return this;
    }
}