package com.ringcentral.definitions;


public class Photo {
    /**
     * Required
     * Enum: photo
     */
    public String type;
    /**
     * Required
     */
    public String value;

    public Photo type(String type) {
        this.type = type;
        return this;
    }

    public Photo value(String value) {
        this.value = value;
        return this;
    }

}
