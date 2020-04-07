package com.ringcentral.definitions;


public class CustomFieldResource {
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

    public CustomFieldResource id(String id) {
        this.id = id;
        return this;
    }

    public CustomFieldResource category(String category) {
        this.category = category;
        return this;
    }

    public CustomFieldResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
