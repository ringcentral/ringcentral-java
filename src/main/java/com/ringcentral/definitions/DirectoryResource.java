package com.ringcentral.definitions;


public class DirectoryResource {
    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    /**
     * Required
     */
    public ContactResource[] records;

    public DirectoryResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public DirectoryResource records(ContactResource[] records) {
        this.records = records;
        return this;
    }
}
