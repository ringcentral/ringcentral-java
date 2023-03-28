package com.ringcentral.definitions;


public class ExtensionWithRolesResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String extensionId;
    /**
     *
     */
    public AssignedRoleResource[] roles;

    public ExtensionWithRolesResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionWithRolesResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionWithRolesResource roles(AssignedRoleResource[] roles) {
        this.roles = roles;
        return this;
    }
}
