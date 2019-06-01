package com.ringcentral.definitions;


public class ListExtensionsParameters {
    /**
     * Extension number to retrieve
     */
    public String extensionId;
    /**
     * Extension email address
     */
    public String email;
    /**
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    /**
     * Extension current state. Multiple values are supported. If 'Unassigned' is specified, then extensions without extensionNumber are returned. If not specified, then all extensions are returned.
     */
    public String[] status;
    /**
     * Extension type. Multiple values are supported
     */
    public String[] type;

    public ListExtensionsParameters extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ListExtensionsParameters email(String email) {
        this.email = email;
        return this;
    }

    public ListExtensionsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListExtensionsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListExtensionsParameters type(String[] type) {
        this.type = type;
        return this;
    }

}
