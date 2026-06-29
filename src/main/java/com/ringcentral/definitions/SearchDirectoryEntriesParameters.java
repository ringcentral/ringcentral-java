package com.ringcentral.definitions;

/** Query parameters for operation searchDirectoryEntries */
public class SearchDirectoryEntriesParameters {
    /**
     * Allows to make lookups across a whole directory skipping a filtering logic of Cross-Site
     * access management feature. Default: true
     */
    public Boolean accessibleSitesOnly;

    public SearchDirectoryEntriesParameters accessibleSitesOnly(Boolean accessibleSitesOnly) {
        this.accessibleSitesOnly = accessibleSitesOnly;
        return this;
    }
}
