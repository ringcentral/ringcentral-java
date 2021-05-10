package com.ringcentral.definitions;


public class CustomFieldInfo {
    /**
     * Internal identifier of a custom field
     */
    public String id;
    /**
     * Custom field value
     */
    public String value;
    /**
     *
     */
    public String displayName;

    public CustomFieldInfo id(String id) {
        this.id = id;
        return this;
    }

    public CustomFieldInfo value(String value) {
        this.value = value;
        return this;
    }

    public CustomFieldInfo displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
