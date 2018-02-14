package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SCIMSearchRequestInfo
{
    // page size
    public Long count;
    public SCIMSearchRequestInfo count(Long count) {
        this.count = count;
        return this;
    }
    // only support 'userName' or 'email' filter expressions for now
    public String filter;
    public SCIMSearchRequestInfo filter(String filter) {
        this.filter = filter;
        return this;
    }
    //
    public String[] schemas;
    public SCIMSearchRequestInfo schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // start index (1-based)
    public Long startIndex;
    public SCIMSearchRequestInfo startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
}
