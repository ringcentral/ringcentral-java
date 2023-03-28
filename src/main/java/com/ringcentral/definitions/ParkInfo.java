package com.ringcentral.definitions;


/**
 * Call park information
 */
public class ParkInfo {
    /**
     * Call park identifier
     */
    public String id;

    public ParkInfo id(String id) {
        this.id = id;
        return this;
    }
}
