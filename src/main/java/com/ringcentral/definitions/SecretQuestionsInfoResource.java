package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SecretQuestionsInfoResource
{
    //
    public String uri;
    public SecretQuestionsInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public SecretQuestionInfoResource[] records;
    public SecretQuestionsInfoResource records(SecretQuestionInfoResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public SecretQuestionsInfoResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public SecretQuestionsInfoResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
