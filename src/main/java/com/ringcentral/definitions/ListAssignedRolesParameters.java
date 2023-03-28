package com.ringcentral.definitions;


/**
 * Query parameters for operation listAssignedRoles
 */
public class ListAssignedRolesParameters {
    /**
     * Specifies if hidden roles are shown or not
     */
    public Boolean showHidden;

    public ListAssignedRolesParameters showHidden(Boolean showHidden) {
        this.showHidden = showHidden;
        return this;
    }
}
