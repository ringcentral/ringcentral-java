package com.ringcentral.definitions;


/**
 * Advanced permissions capabilities. Returned if `advancedPermissions` query parameter is set to `true`.
 */
public class PermissionsCapabilities {
    /**
     * Specifies whether the user is enabled with the listed permission or not
     */
    public Boolean enabled;
    /**
     * Specifies if the user can manage the listed permission and is allowed to enable it on other users
     */
    public Boolean manageEnabled;
    /**
     * Specifies if the users who were enabled with the listed permission can grant it further to other users
     */
    public Boolean grantEnabled;

    public PermissionsCapabilities enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public PermissionsCapabilities manageEnabled(Boolean manageEnabled) {
        this.manageEnabled = manageEnabled;
        return this;
    }

    public PermissionsCapabilities grantEnabled(Boolean grantEnabled) {
        this.grantEnabled = grantEnabled;
        return this;
    }
}
