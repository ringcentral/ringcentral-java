package com.ringcentral.definitions;


public class DevicesPaginationResource {
    /**
     *
     */
    public DeviceResource[] records;
    /**
     *
     */
    public PagingInfo paging;

    public DevicesPaginationResource records(DeviceResource[] records) {
        this.records = records;
        return this;
    }

    public DevicesPaginationResource paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
