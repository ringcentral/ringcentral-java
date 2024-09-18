package com.ringcentral.definitions;


/**
 * Query parameters for operation readDirectoryEntry
 */
public class ReadDirectoryEntryParameters {
    /**
     * Flag to enable cross-site limitation checking
     * Example: true
     */
    public Boolean accessibleSitesOnly;

    public ReadDirectoryEntryParameters accessibleSitesOnly(Boolean accessibleSitesOnly) {
        this.accessibleSitesOnly = accessibleSitesOnly;
        return this;
    }
}
