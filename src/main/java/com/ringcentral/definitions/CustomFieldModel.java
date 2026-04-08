package com.ringcentral.definitions;


public class CustomFieldModel
{
    /**
     * Custom field identifier
     */
    public String id;
    public CustomFieldModel id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Object category to attach custom fields
     * Enum: User
     */
    public String category;
    public CustomFieldModel category(String category)
    {
        this.category = category;
        return this;
    }

    /**
     * Custom field display name
     */
    public String displayName;
    public CustomFieldModel displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
}