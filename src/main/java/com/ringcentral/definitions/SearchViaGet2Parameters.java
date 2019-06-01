package com.ringcentral.definitions;


public class SearchViaGet2Parameters {
    /**
     * only support 'userName' or 'email' filter expressions for now
     */
    public String filter;
    /**
     * start index (1-based)
     * Default: 1
     */
    public Long startIndex;
    /**
     * page size
     * Default: 100
     */
    public Long count;

    public SearchViaGet2Parameters filter(String filter) {
        this.filter = filter;
        return this;
    }

    public SearchViaGet2Parameters startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public SearchViaGet2Parameters count(Long count) {
        this.count = count;
        return this;
    }

}
