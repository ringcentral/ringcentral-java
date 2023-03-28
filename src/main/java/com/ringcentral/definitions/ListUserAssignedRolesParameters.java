package com.ringcentral.definitions;


/**
 * Query parameters for operation listUserAssignedRoles
 */
public class ListUserAssignedRolesParameters {
    /**
     * Specifies if hidden roles are shown or not
     */
    public Boolean showHidden;

    public ListUserAssignedRolesParameters showHidden(Boolean showHidden) {
        this.showHidden = showHidden;
        return this;
    }
}
