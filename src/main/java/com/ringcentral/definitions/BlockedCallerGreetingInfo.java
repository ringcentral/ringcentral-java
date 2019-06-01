package com.ringcentral.definitions;


public class BlockedCallerGreetingInfo {
    /**
     * Type of a greeting
     */
    public String type;
    /**
     *
     */
    public PresetInfo preset;

    public BlockedCallerGreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public BlockedCallerGreetingInfo preset(PresetInfo preset) {
        this.preset = preset;
        return this;
    }

}
