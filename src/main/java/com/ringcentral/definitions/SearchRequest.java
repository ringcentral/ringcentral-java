package com.ringcentral.definitions;


public class SearchRequest {
    /**
     * page size
     * Format: int32
     */
    public Long count;
    /**
     * only support &#039;userName&#039; or &#039;email&#039; filter expressions for now
     */
    public String filter;
    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:SearchRequest
     */
    public String[] schemas;
    /**
     * start index (1-based)
     * Format: int32
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
