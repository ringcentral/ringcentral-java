package com.ringcentral.definitions;


public class ScimSchemaSearchResponse
{
    /**
     * Resource type list
     */
    public ScimSchemaResponse[] Resources;
    public ScimSchemaSearchResponse Resources(ScimSchemaResponse[] Resources)
    {
        this.Resources = Resources;
        return this;
    }

    /**
     * Format: int64
     */
    public Long itemsPerPage;
    public ScimSchemaSearchResponse itemsPerPage(Long itemsPerPage)
    {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:ListResponse
     */
    public String[] schemas;
    public ScimSchemaSearchResponse schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     * Format: int64
     */
    public Long startIndex;
    public ScimSchemaSearchResponse startIndex(Long startIndex)
    {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Format: int64
     */
    public Long totalResults;
    public ScimSchemaSearchResponse totalResults(Long totalResults)
    {
        this.totalResults = totalResults;
        return this;
    }
}