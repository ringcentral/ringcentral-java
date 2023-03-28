package com.ringcentral.definitions;


public class CostCenterResource {
    /**
     * Example: 83266549237542
     */
    public String id;
    /**
     * Example: Main
     */
    public String code;
    /**
     * Example: Cost Center A
     */
    public String name;

    public CostCenterResource id(String id) {
        this.id = id;
        return this;
    }

    public CostCenterResource code(String code) {
        this.code = code;
        return this;
    }

    public CostCenterResource name(String name) {
        this.name = name;
        return this;
    }
}
