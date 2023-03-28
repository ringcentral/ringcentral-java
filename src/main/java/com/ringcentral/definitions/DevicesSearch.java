package com.ringcentral.definitions;


public class DevicesSearch {
    /**
     * String value to filter the devices. Should being found by fields name, extensionName, phoneNumber, serial, extensionNumber
     */
    public String searchString;
    /**
     * Filtering by order status.
     * Enum: InProgress, PendingReplacement, Delivered
     */
    public String[] orderStatuses;
    /**
     * Internal identifiers of the business sites to which devices belong.
     */
    public String[] siteIds;
    /**
     * Internal identifiers (codes) of the device types
     */
    public String[] types;
    /**
     * Internal identifiers (codes) of the device types to exclude from the response
     */
    public String[] excludeTypes;
    /**
     * A list of Country IDs
     */
    public String[] countryIds;
    /**
     * A list of area codes
     */
    public String[] areaCodes;
    /**
     * Filtering by assigned type
     * Enum: AssignedUserPhone, UnassignedUserPhone, UnassignedPhone
     */
    public String[] assignedTypes;
    /**
     * Page number
     * Format: int32
     */
    public Long page;
    /**
     * Number of records returned per page.
     * Format: int32
     */
    public Long perPage;
    /**
     *
     */
    public DevicesSearchOrderBy[] orderBy;

    public DevicesSearch searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public DevicesSearch orderStatuses(String[] orderStatuses) {
        this.orderStatuses = orderStatuses;
        return this;
    }

    public DevicesSearch siteIds(String[] siteIds) {
        this.siteIds = siteIds;
        return this;
    }

    public DevicesSearch types(String[] types) {
        this.types = types;
        return this;
    }

    public DevicesSearch excludeTypes(String[] excludeTypes) {
        this.excludeTypes = excludeTypes;
        return this;
    }

    public DevicesSearch countryIds(String[] countryIds) {
        this.countryIds = countryIds;
        return this;
    }

    public DevicesSearch areaCodes(String[] areaCodes) {
        this.areaCodes = areaCodes;
        return this;
    }

    public DevicesSearch assignedTypes(String[] assignedTypes) {
        this.assignedTypes = assignedTypes;
        return this;
    }

    public DevicesSearch page(Long page) {
        this.page = page;
        return this;
    }

    public DevicesSearch perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public DevicesSearch orderBy(DevicesSearchOrderBy[] orderBy) {
        this.orderBy = orderBy;
        return this;
    }
}
