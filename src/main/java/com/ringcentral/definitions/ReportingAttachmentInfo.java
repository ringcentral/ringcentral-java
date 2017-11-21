package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReportingAttachmentInfo
{
    // Specifies whether to include CSV version of the report
    public Boolean csv;
    public ReportingAttachmentInfo csv(Boolean csv) {
        this.csv = csv;
        return this;
    }
    // Specifies whether to include PDF version of the report
    public Boolean pdf;
    public ReportingAttachmentInfo pdf(Boolean pdf) {
        this.pdf = pdf;
        return this;
    }
}
