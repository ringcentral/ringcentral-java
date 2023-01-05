package com.ringcentral.definitions;


public class DirectoryResource
{
    /**
     * Required
     */
    public PagingInfo paging;
    public DirectoryResource paging(PagingInfo paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     * Required
     */
    public ContactResource[] records;
    public DirectoryResource records(ContactResource[] records)
    {
        this.records = records;
        return this;
    }
}