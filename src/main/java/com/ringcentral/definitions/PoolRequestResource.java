package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PoolRequestResource
{
    //
    public String rendererId;
    public PoolRequestResource rendererId(String rendererId) {
        this.rendererId = rendererId;
        return this;
    }
}
