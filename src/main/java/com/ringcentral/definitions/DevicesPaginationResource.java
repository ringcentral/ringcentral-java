package com.ringcentral.definitions;


public class DevicesPaginationResource
{
    /**
     */
    public DeviceResource[] records;
    public DevicesPaginationResource records(DeviceResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PagingInfo paging;
    public DevicesPaginationResource paging(PagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}