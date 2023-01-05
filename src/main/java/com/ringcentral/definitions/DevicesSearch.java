package com.ringcentral.definitions;


public class DevicesSearch
{
    /**
     * String value to filter the devices. Should being found by fields name, extensionName, phoneNumber, serial, extensionNumber
     */
    public String searchString;
    public DevicesSearch searchString(String searchString)
    {
        this.searchString = searchString;
        return this;
    }

    /**
     * Filtering by order status.
     * Enum: InProgress, PendingReplacement, Delivered
     */
    public String[] orderStatuses;
    public DevicesSearch orderStatuses(String[] orderStatuses)
    {
        this.orderStatuses = orderStatuses;
        return this;
    }

    /**
     * Internal identifiers of the business sites to which devices belong.
     */
    public String[] siteIds;
    public DevicesSearch siteIds(String[] siteIds)
    {
        this.siteIds = siteIds;
        return this;
    }

    /**
     * Internal identifiers (codes) of the device types
     */
    public String[] types;
    public DevicesSearch types(String[] types)
    {
        this.types = types;
        return this;
    }

    /**
     * Internal identifiers (codes) of the device types to exclude from the response
     */
    public String[] excludeTypes;
    public DevicesSearch excludeTypes(String[] excludeTypes)
    {
        this.excludeTypes = excludeTypes;
        return this;
    }

    /**
     * A list of Country IDs
     */
    public String[] countryIds;
    public DevicesSearch countryIds(String[] countryIds)
    {
        this.countryIds = countryIds;
        return this;
    }

    /**
     * A list of area codes
     */
    public String[] areaCodes;
    public DevicesSearch areaCodes(String[] areaCodes)
    {
        this.areaCodes = areaCodes;
        return this;
    }

    /**
     * Filtering by assigned type
     * Enum: AssignedUserPhone, UnassignedUserPhone, UnassignedPhone
     */
    public String[] assignedTypes;
    public DevicesSearch assignedTypes(String[] assignedTypes)
    {
        this.assignedTypes = assignedTypes;
        return this;
    }

    /**
     * Page number
     * Format: int32
     */
    public Long page;
    public DevicesSearch page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Number of records returned per page.
     * Format: int32
     */
    public Long perPage;
    public DevicesSearch perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     */
    public DevicesSearchOrderBy[] orderBy;
    public DevicesSearch orderBy(DevicesSearchOrderBy[] orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }
}