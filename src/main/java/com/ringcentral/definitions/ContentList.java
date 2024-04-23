package com.ringcentral.definitions;


public class ContentList {
    /**
     * Required
     */
    public ContentModel[] records;
    /**
     * Required
     */
    public NonEnumeratedPagingModel paging;

    public ContentList records(ContentModel[] records) {
        this.records = records;
        return this;
    }

    public ContentList paging(NonEnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
