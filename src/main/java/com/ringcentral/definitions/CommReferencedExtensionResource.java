package com.ringcentral.definitions;


public class CommReferencedExtensionResource {
    /**
     * Internal identifier of an extension
     * Required
     * Example: 4321432156
     */
    public String id;

    public CommReferencedExtensionResource id(String id) {
        this.id = id;
        return this;
    }
}
