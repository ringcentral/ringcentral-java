package com.ringcentral.definitions;


public class SessionGlobalListResource {
    /**
     * Required
     */
    public SessionGlobalResource[] records;
    /**
     * Required
     */
    public RcwPagingModel paging;

    public SessionGlobalListResource records(SessionGlobalResource[] records) {
        this.records = records;
        return this;
    }

    public SessionGlobalListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
