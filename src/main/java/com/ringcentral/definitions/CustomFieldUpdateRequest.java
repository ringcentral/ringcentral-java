package com.ringcentral.definitions;


public class CustomFieldUpdateRequest {
    /**
     * Custom field display name
     */
    public String displayName;

    public CustomFieldUpdateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
