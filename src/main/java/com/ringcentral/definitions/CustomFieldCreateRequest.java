package com.ringcentral.definitions;


public class CustomFieldCreateRequest {
    /**
     * Object category to attach custom fields
     * Enum: User
     */
    public String category;
    /**
     * Custom field display name
     */
    public String displayName;

    public CustomFieldCreateRequest category(String category) {
        this.category = category;
        return this;
    }

    public CustomFieldCreateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
