package com.ringcentral.definitions;


public class ExtensionCreationResponseCostCenter {
    /**
     * Internal identifier of a cost center
     */
    public String id;
    /**
     * Name of a cost center
     */
    public String name;

    public ExtensionCreationResponseCostCenter id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionCreationResponseCostCenter name(String name) {
        this.name = name;
        return this;
    }
}
