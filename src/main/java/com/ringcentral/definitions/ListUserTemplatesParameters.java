package com.ringcentral.definitions;


/**
 * Query parameters for operation listUserTemplates
 */
public class ListUserTemplatesParameters {
    /**
     * Type of a template
     * Enum: UserSettings, CallHandling
     */
    public String type;
    /**
     * Indicates the page number to retrieve. Only positive number values
     * are allowed
     */
    public String page;
    /**
     * Indicates the page size (number of items)
     */
    public String perPage;

    public ListUserTemplatesParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListUserTemplatesParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListUserTemplatesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
}
