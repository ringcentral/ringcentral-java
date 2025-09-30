package com.ringcentral.definitions;


public class ScimAuthenticationScheme {
    /**
     *
     */
    public String description;
    /**
     * Format: uri
     */
    public String documentationUri;
    /**
     *
     */
    public String name;
    /**
     * Format: uri
     */
    public String specUri;
    /**
     *
     */
    public Boolean primary;

    public ScimAuthenticationScheme description(String description) {
        this.description = description;
        return this;
    }

    public ScimAuthenticationScheme documentationUri(String documentationUri) {
        this.documentationUri = documentationUri;
        return this;
    }

    public ScimAuthenticationScheme name(String name) {
        this.name = name;
        return this;
    }

    public ScimAuthenticationScheme specUri(String specUri) {
        this.specUri = specUri;
        return this;
    }

    public ScimAuthenticationScheme primary(Boolean primary) {
        this.primary = primary;
        return this;
    }
}
