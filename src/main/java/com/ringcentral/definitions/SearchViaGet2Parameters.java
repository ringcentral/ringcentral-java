package com.ringcentral.definitions;


// Query parameters for operation searchViaGet2
public class SearchViaGet2Parameters {
    /**
     * only support 'userName' or 'email' filter expressions for now
     */
    public String filter;
    /**
     * start index (1-based)
     * Format: int32
     * Default: 1
     */
    public Long startIndex;
    /**
     * page size
     * Format: int32
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
