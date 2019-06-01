package com.ringcentral.definitions;


public class SearchRequest {
    /**
     * page size
     */
    public Long count;
    /**
     * only support 'userName' or 'email' filter expressions for now
     */
    public String filter;
    /**
     *
     */
    public String[] schemas;
    /**
     * start index (1-based)
     */
    public Long startIndex;

    public SearchRequest count(Long count) {
        this.count = count;
        return this;
    }

    public SearchRequest filter(String filter) {
        this.filter = filter;
        return this;
    }

    public SearchRequest schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public SearchRequest startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

}
