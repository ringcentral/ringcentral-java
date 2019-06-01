package com.ringcentral.definitions;


public class MethodInfo {
    /**
     * Method identifier. The default value is 1 (Ground)
     * Enum: 1, 2, 3
     */
    public String id;
    /**
     * Method name, corresponding to the identifier
     * Enum: Ground, 2 Day, Overnight
     */
    public String name;

    public MethodInfo id(String id) {
        this.id = id;
        return this;
    }

    public MethodInfo name(String name) {
        this.name = name;
        return this;
    }

}
