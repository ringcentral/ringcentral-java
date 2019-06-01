package com.ringcentral.definitions;


public class PagingGroupExtensionInfo {
    /**
     * Internal identifier of a paging group user extension
     */
    public String id;
    /**
     * Link to a paging group user extension
     */
    public String uri;
    /**
     * Extension number of a paging group user
     */
    public String extensionNumber;
    /**
     * Name of a paging group user
     */
    public String name;

    public PagingGroupExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public PagingGroupExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PagingGroupExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public PagingGroupExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

}
