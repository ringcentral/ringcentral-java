package com.ringcentral.definitions;


public class CallRecordingExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Link to an extension resource
     */
    public String uri;
    /**
     * Number of an extension
     */
    public String extensionNumber;
    /**
     * Name of an extension
     */
    public String name;

    public CallRecordingExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallRecordingExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallRecordingExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallRecordingExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

}
