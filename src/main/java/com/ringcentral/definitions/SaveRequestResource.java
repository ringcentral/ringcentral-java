package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SaveRequestResource
{
    //
    public String rendererId;
    public SaveRequestResource rendererId(String rendererId) {
        this.rendererId = rendererId;
        return this;
    }
    //
    public String messageId;
    public SaveRequestResource messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    //
    public String status;
    public SaveRequestResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public String resultFile;
    public SaveRequestResource resultFile(String resultFile) {
        this.resultFile = resultFile;
        return this;
    }
}
