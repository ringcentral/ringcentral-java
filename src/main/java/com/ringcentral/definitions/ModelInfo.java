package com.ringcentral.definitions;


/**
 * HardPhone model information
 */
public class ModelInfo {
    /**
     * Internal identifier of a HardPhone device model
     */
    public String id;
    /**
     * Device name
     */
    public String name;
    /**
     * Addons description
     */
    public AddonInfo[] addons;
    /**
     *
     */
    public String deviceClass;
    /**
     * Device feature or multiple features supported
     * Enum: BLA, CommonPhone, Intercom, Paging, HELD
     */
    public String[] features;
    /**
     * Max supported count of phone lines
     * Format: int32
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

    public ModelInfo deviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
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
