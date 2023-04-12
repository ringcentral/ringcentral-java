package com.ringcentral.definitions;


public class WcsSessionGlobalListResource {
    /**
     * Required
     */
    public SessionGlobalListEntry[] records;
    /**
     * Required
     */
    public RcwPagingModel paging;

    public WcsSessionGlobalListResource records(SessionGlobalListEntry[] records) {
        this.records = records;
        return this;
    }

    public WcsSessionGlobalListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
