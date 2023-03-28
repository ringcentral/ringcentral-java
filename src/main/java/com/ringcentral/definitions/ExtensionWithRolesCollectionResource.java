package com.ringcentral.definitions;


public class ExtensionWithRolesCollectionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public ExtensionWithRolesResource[] records;

    public ExtensionWithRolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionWithRolesCollectionResource records(ExtensionWithRolesResource[] records) {
        this.records = records;
        return this;
    }
}
