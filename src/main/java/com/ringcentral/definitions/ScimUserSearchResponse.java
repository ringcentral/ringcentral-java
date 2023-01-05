package com.ringcentral.definitions;


public class ScimUserSearchResponse
{
    /**
     * User list
     */
    public ScimUserResponse[] Resources;
    public ScimUserSearchResponse Resources(ScimUserResponse[] Resources)
    {
        this.Resources = Resources;
        return this;
    }

    /**
     * Format: int64
     */
    public Long itemsPerPage;
    public ScimUserSearchResponse itemsPerPage(Long itemsPerPage)
    {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:ListResponse
     */
    public String[] schemas;
    public ScimUserSearchResponse schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     * Format: int64
     */
    public Long startIndex;
    public ScimUserSearchResponse startIndex(Long startIndex)
    {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Format: int64
     */
    public Long totalResults;
    public ScimUserSearchResponse totalResults(Long totalResults)
    {
        this.totalResults = totalResults;
        return this;
    }
}