package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CfaAttachments
{
    //
    public Boolean csv;
    public CfaAttachments csv(Boolean csv) {
        this.csv = csv;
        return this;
    }
    //
    public Boolean pdf;
    public CfaAttachments pdf(Boolean pdf) {
        this.pdf = pdf;
        return this;
    }
}
