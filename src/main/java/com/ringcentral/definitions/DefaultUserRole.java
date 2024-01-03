package com.ringcentral.definitions;


public class DefaultUserRole {
    /**
     * Link to a default role resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a default role
     */
    public String id;
    /**
     * Custom name of a default role
     * Example: My Custom User Role
     */
    public String displayName;

    public DefaultUserRole uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DefaultUserRole id(String id) {
        this.id = id;
        return this;
    }

    public DefaultUserRole displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
