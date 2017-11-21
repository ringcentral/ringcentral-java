package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AttachmentInfoReporting
{
    // Specifies whether to include CSV version of the report
    public Boolean csv;
    public AttachmentInfoReporting csv(Boolean csv) {
        this.csv = csv;
        return this;
    }
    // Specifies whether to include PDF version of the report
    public Boolean pdf;
    public AttachmentInfoReporting pdf(Boolean pdf) {
        this.pdf = pdf;
        return this;
    }
}
