package com.ringcentral.definitions;


public class ActiveCallsRecordExtensionInfo {
    /**
     * Link to an extension on whose behalf a call is initiated
     */
    public String uri;
    /**
     * Internal identifier of an extension on whose behalf a call is initiated
     */
    public String id;

    public ActiveCallsRecordExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ActiveCallsRecordExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

}
