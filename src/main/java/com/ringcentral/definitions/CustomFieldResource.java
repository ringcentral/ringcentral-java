package com.ringcentral.definitions;


public class CustomFieldResource {
    /**
     * Example: 1032854
     */
    public String id;
    /**
     * Example: Rank
     */
    public String name;
    /**
     * Example: 5
     */
    public String value;

    public CustomFieldResource id(String id) {
        this.id = id;
        return this;
    }

    public CustomFieldResource name(String name) {
        this.name = name;
        return this;
    }

    public CustomFieldResource value(String value) {
        this.value = value;
        return this;
    }
}
