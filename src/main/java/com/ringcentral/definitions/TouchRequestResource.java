package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TouchRequestResource
{
    //
    public String rendererId;
    public TouchRequestResource rendererId(String rendererId) {
        this.rendererId = rendererId;
        return this;
    }
    //
    public String messageId;
    public TouchRequestResource messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
}
