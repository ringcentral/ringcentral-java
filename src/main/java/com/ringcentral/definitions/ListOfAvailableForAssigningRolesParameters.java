package com.ringcentral.definitions;


/**
 * Query parameters for operation listOfAvailableForAssigningRoles
 */
public class ListOfAvailableForAssigningRolesParameters {
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;

    public ListOfAvailableForAssigningRolesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListOfAvailableForAssigningRolesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
