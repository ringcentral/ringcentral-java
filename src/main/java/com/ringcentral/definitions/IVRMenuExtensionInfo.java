package com.ringcentral.definitions;


// For 'Connect' or 'Voicemail' actions only. Extension reference
public class IVRMenuExtensionInfo {
    /**
     * Link to an extension resource
     */
    public String uri;
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Name of an extension
     */
    public String name;

    public IVRMenuExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRMenuExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public IVRMenuExtensionInfo name(String name) {
        this.name = name;
        return this;
    }
}
