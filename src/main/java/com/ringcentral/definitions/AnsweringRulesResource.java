package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AnsweringRulesResource
{
    //
    public String uri;
    public AnsweringRulesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public AnsweringRuleResource[] records;
    public AnsweringRulesResource records(AnsweringRuleResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public AnsweringRulesResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public AnsweringRulesResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
