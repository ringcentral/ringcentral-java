package com.ringcentral.definitions;


public class AuthenticationScheme {
    /**
     *
     */
    public String description;
    /**
     *
     */
    public String documentationUri;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String specUri;
    /**
     *
     */
    public Boolean primary;

    public AuthenticationScheme description(String description) {
        this.description = description;
        return this;
    }

    public AuthenticationScheme documentationUri(String documentationUri) {
        this.documentationUri = documentationUri;
        return this;
    }

    public AuthenticationScheme name(String name) {
        this.name = name;
        return this;
    }

    public AuthenticationScheme specUri(String specUri) {
        this.specUri = specUri;
        return this;
    }

    public AuthenticationScheme primary(Boolean primary) {
        this.primary = primary;
        return this;
    }

}
