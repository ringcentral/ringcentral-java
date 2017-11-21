package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ModelInfo
{
    // Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
    public String id;
    public ModelInfo id(String id) {
        this.id = id;
        return this;
    }
    // Device name
    public String name;
    public ModelInfo name(String name) {
        this.name = name;
        return this;
    }
    // Addons description
    public AddonInfo addons;
    public ModelInfo addons(AddonInfo addons) {
        this.addons = addons;
        return this;
    }
}
