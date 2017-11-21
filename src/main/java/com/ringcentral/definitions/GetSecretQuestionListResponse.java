package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetSecretQuestionListResponse
{
    // Canonical URI of a question list resource
    public String uri;
    public GetSecretQuestionListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of secret questions with their descriptions
    public SecretQuestionInfo[] records;
    public GetSecretQuestionListResponse records(SecretQuestionInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetSecretQuestionListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetSecretQuestionListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
