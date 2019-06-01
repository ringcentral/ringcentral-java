package com.ringcentral.definitions;


public class IVRMenuExtensionInfo {
    /**
     * Link to an extension resource
     */
    public String uri;
    /**
     * Internal identifier of an extension
     */
    public String id;

    public IVRMenuExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRMenuExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

}
