package com.ringcentral.definitions;

public class ModelInfo {
    // Device model identifier. Mandatory when ordering a HardPhone if boxBillingId is not used for ordering
    public String id;
    // Device name
    public String name;
    // Addons description
    public AddonInfo[] addons;
}
