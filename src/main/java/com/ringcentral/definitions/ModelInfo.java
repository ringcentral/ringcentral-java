package com.ringcentral.definitions;

public class ModelInfo {
    // Device model identifier. Mandatory when ordering a HardPhone if boxBillingId is not used for ordering
    public String id;
    // Device name
    public String name;
    // Addons description
    public AddonInfo[] addons;

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
}
