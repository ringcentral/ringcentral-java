package com.ringcentral.definitions;


/**
 * Cost center information. Applicable if Cost Center feature is enabled. The default is `root` cost center value
 */
public class CostCenterInfo {
    /**
     * Internal identifier of a cost center
     */
    public String id;
    /**
     * Name of a cost center
     */
    public String name;

    public CostCenterInfo id(String id) {
        this.id = id;
        return this;
    }

    public CostCenterInfo name(String name) {
        this.name = name;
        return this;
    }
}
