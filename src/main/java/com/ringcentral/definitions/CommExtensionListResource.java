package com.ringcentral.definitions;


public class CommExtensionListResource {
    /**
     * Required
     */
    public CommReferencedExtensionResource[] referencedExtensions;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public CommExtensionListResource referencedExtensions(CommReferencedExtensionResource[] referencedExtensions) {
        this.referencedExtensions = referencedExtensions;
        return this;
    }

    public CommExtensionListResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
