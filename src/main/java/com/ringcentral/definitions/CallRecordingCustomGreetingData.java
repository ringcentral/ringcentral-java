package com.ringcentral.definitions;


public class CallRecordingCustomGreetingData {
    /**
     * Link to a custom company greeting
     */
    public String uri;
    /**
     * Internal identifier of a custom company greeting
     */
    public String id;

    public CallRecordingCustomGreetingData uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallRecordingCustomGreetingData id(String id) {
        this.id = id;
        return this;
    }

}
