package com.ringcentral.definitions;


public class ModelInfo {
    /**
     * Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
     */
    public String id;
    /**
     * Device name
     */
    public String name;
    /**
     * Addons description
     * Required
     */
    public AddonInfo[] addons;
    /**
     * Device feature or multiple features supported
     */
    public String[] features;
    /**
     * Max supported count of phone lines
     */
    public Long lineCount;

    public ModelInfo id(String id) {
        this.id = id;
        return this;
    }

    public ModelInfo name(String name) {
        this.name = name;
        return this;
    }

    public ModelInfo addons(AddonInfo[] addons) {
        this.addons = addons;
        return this;
    }

    public ModelInfo features(String[] features) {
        this.features = features;
        return this;
    }

    public ModelInfo lineCount(Long lineCount) {
        this.lineCount = lineCount;
        return this;
    }

}
