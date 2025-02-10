package com.ringcentral.definitions;


/**
 * Query parameters for operation readDirectoryEntry
 */
public class ReadDirectoryEntryParameters {
    /**
     * Allows to make lookups across a whole directory skipping a filtering logic of Cross-Site access management feature.
     * Default: true
     */
    public Boolean accessibleSitesOnly;

    public ReadDirectoryEntryParameters accessibleSitesOnly(Boolean accessibleSitesOnly) {
        this.accessibleSitesOnly = accessibleSitesOnly;
        return this;
    }
}
