package com.ringcentral.definitions;


public class ScimResourceTypeSearchResponse
{
    /**
     * Resource type list
     */
    public ScimResourceTypeResponse[] Resources;
    public ScimResourceTypeSearchResponse Resources(ScimResourceTypeResponse[] Resources)
    {
        this.Resources = Resources;
        return this;
    }

    /**
     * Format: int64
     */
    public Long itemsPerPage;
    public ScimResourceTypeSearchResponse itemsPerPage(Long itemsPerPage)
    {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:ListResponse
     */
    public String[] schemas;
    public ScimResourceTypeSearchResponse schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     * Format: int64
     */
    public Long startIndex;
    public ScimResourceTypeSearchResponse startIndex(Long startIndex)
    {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Format: int64
     */
    public Long totalResults;
    public ScimResourceTypeSearchResponse totalResults(Long totalResults)
    {
        this.totalResults = totalResults;
        return this;
    }
}