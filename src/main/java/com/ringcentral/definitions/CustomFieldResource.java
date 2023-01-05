package com.ringcentral.definitions;


public class CustomFieldResource
{
    /**
     * Custom field identifier
     */
    public String id;
    public CustomFieldResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Object category to attach custom fields
     * Enum: User
     */
    public String category;
    public CustomFieldResource category(String category)
    {
        this.category = category;
        return this;
    }

    /**
     * Custom field display name
     */
    public String displayName;
    public CustomFieldResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
}