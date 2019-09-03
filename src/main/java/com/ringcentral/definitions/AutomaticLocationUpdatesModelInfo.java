package com.ringcentral.definitions;


public class AutomaticLocationUpdatesModelInfo {
    /**
     * Device model identifier
     */
    public String id;
    /**
     * Device name
     */
    public String name;
    /**
     * Device feature or multiple features supported
     */
    public String[] features;

    public AutomaticLocationUpdatesModelInfo id(String id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesModelInfo name(String name) {
        this.name = name;
        return this;
    }

    public AutomaticLocationUpdatesModelInfo features(String[] features) {
        this.features = features;
        return this;
    }

}
