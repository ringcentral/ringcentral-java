package com.ringcentral.definitions;


public class DirectoryResource {
    /**
     *
     */
    public CompanyContactsPagingInfo paging;
    /**
     *
     */
    public ContactResource[] records;

    public DirectoryResource paging(CompanyContactsPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public DirectoryResource records(ContactResource[] records) {
        this.records = records;
        return this;
    }

}
