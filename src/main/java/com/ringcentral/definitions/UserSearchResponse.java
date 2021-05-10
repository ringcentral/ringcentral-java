package com.ringcentral.definitions;


public class UserSearchResponse {
    /**
     * user list
     */
    public UserResponse[] Resources;
    /**
     * Format: int64
     */
    public Long itemsPerPage;
    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:ListResponse
     */
    public String[] schemas;
    /**
     * Format: int64
     */
    public Long startIndex;
    /**
     * Format: int64
     */
    public Long totalResults;

    public UserSearchResponse Resources(UserResponse[] Resources) {
        this.Resources = Resources;
        return this;
    }

    public UserSearchResponse itemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    public UserSearchResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public UserSearchResponse startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public UserSearchResponse totalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }
}
