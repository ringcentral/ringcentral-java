package com.ringcentral.definitions;


public class CostCenterResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String code;
    /**
     *
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
