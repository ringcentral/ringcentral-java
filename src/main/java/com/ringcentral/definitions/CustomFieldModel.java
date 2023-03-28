package com.ringcentral.definitions;


public class CustomFieldModel {
    /**
     * Custom field identifier
     */
    public String id;
    /**
     * Object category to attach custom fields
     * Enum: User
     */
    public String category;
    /**
     * Custom field display name
     */
    public String displayName;

    public CustomFieldModel id(String id) {
        this.id = id;
        return this;
    }

    public CustomFieldModel category(String category) {
        this.category = category;
        return this;
    }

    public CustomFieldModel displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
