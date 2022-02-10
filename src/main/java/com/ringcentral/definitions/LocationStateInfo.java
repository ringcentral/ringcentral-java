package com.ringcentral.definitions;


/**
 * Information on the state this location belongs to
 */
public class LocationStateInfo {
    /**
     * Internal identifier of a state
     */
    public String id;
    /**
     * Link to a state resource
     */
    public String uri;

    public LocationStateInfo id(String id) {
        this.id = id;
        return this;
    }

    public LocationStateInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
