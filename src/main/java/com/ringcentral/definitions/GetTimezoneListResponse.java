package com.ringcentral.definitions;


public class GetTimezoneListResponse
{
    /**
     * Link to the timezone list resource
     * Format: uri
     */
    public String uri;
    public GetTimezoneListResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of timezones
     * Required
     */
    public TimezoneInfoBase[] records;
    public GetTimezoneListResponse records(TimezoneInfoBase[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public GetTimezoneListResponse navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public GetTimezoneListResponse paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}