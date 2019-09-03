package com.ringcentral.definitions;


public class PlayResource {
    /**
     * Absolute path to media resource.
     */
    public String uri;
    /**
     * Absolute path to custom greeting.
     */
    public String custom;
    /**
     *
     */
    public Object system;

    public PlayResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PlayResource custom(String custom) {
        this.custom = custom;
        return this;
    }

    public PlayResource system(Object system) {
        this.system = system;
        return this;
    }

}
