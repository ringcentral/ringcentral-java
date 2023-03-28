package com.ringcentral.definitions;


/**
 * Query parameters for operation scimSearchViaGet2
 */
public class ScimSearchViaGet2Parameters {
    /**
     * Only support &#039;userName&#039; or &#039;email&#039; filter expressions for now
     */
    public String filter;
    /**
     * Start index (1-based)
     * Format: int32
     * Default: 1
     */
    public Long startIndex;
    /**
     * Page size
     * Format: int32
     * Default: 100
     */
    public Long count;

    public ScimSearchViaGet2Parameters filter(String filter) {
        this.filter = filter;
        return this;
    }

    public ScimSearchViaGet2Parameters startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public ScimSearchViaGet2Parameters count(Long count) {
        this.count = count;
        return this;
    }
}
