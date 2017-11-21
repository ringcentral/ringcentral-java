package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdateMessageRequest
{
    // Read status of a message to be changed. Multiple values are accepted
    public String readStatus;
    public UpdateMessageRequest readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }
}
