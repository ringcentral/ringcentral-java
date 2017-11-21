package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetUserListResponse
{
    // Specification links
    public String[] schemas;
    public GetUserListResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // 1-based index of query result
    public Long startIndex;
    public GetUserListResponse startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    // Results count
    public Long totalResults;
    public GetUserListResponse totalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    // List of users with detailed info
    public UserInfo[] Resources;
    public GetUserListResponse Resources(UserInfo[] Resources) {
        this.Resources = Resources;
        return this;
    }
    // Number of users displayed per page
    public Long itemsPerPage;
    public GetUserListResponse itemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }
}
