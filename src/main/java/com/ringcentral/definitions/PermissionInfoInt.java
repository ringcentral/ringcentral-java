package com.ringcentral.definitions;


// International Calling permission
public class PermissionInfoInt {
    /**
     * Specifies if a permission is enabled or not
     */
    public Boolean enabled;

    public PermissionInfoInt enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
