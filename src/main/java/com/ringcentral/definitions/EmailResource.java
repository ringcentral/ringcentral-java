package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EmailResource
{
    //
    public String accountId;
    public EmailResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public String extensionId;
    public EmailResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public String templateId;
    public EmailResource templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    //
    public String[] recipients;
    public EmailResource recipients(String[] recipients) {
        this.recipients = recipients;
        return this;
    }
    //
    public String[] files;
    public EmailResource files(String[] files) {
        this.files = files;
        return this;
    }
}
