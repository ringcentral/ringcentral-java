package com.ringcentral.definitions;

public class GreetingInfo {
    // Type of a greeting, specifying the case when the greeting is played. See also Greeting Types
    public String type;
    // Predefined greeting information
    public PresetInfo preset;

    public GreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public GreetingInfo preset(PresetInfo preset) {
        this.preset = preset;
        return this;
    }
}
