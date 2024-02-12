package com.ringcentral.definitions;


/**
 * Query parameters for operation listUserTemplates
 */
public class ListUserTemplatesParameters {
    /**
     * Type of template
     * Enum: UserSettings, CallHandling
     */
    public String type;
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are allowed. Default value is &#039;1&#039;
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items). If not specified, the value is &#039;100&#039; by default
     * Format: int32
     * Default: 100
     */
    public Long perPage;

    public ListUserTemplatesParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListUserTemplatesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListUserTemplatesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
