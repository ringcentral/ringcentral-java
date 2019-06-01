package com.ringcentral.definitions;


public class UserSearchResponse {
    /**
     * user list
     */
    public UserResponse[] Resources;
    /**
     *
     */
    public Long itemsPerPage;
    /**
     *
     */
    public String[] schemas;
    /**
     *
     */
    public Long startIndex;
    /**
     *
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
