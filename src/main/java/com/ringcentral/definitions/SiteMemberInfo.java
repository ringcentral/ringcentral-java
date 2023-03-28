package com.ringcentral.definitions;


public class SiteMemberInfo {
    /**
     * Format: int64
     */
    public Long id;
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String type;
    /**
     *
     */
    public String name;

    public SiteMemberInfo id(Long id) {
        this.id = id;
        return this;
    }

    public SiteMemberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SiteMemberInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public SiteMemberInfo type(String type) {
        this.type = type;
        return this;
    }

    public SiteMemberInfo name(String name) {
        this.name = name;
        return this;
    }
}
