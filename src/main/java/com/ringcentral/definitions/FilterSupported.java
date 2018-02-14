package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FilterSupported
{
    //
    public Long maxResults;
    public FilterSupported maxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    //
    public Boolean supported;
    public FilterSupported supported(Boolean supported) {
        this.supported = supported;
        return this;
    }
}
