package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipAPNSInfo
{
    // Apple Push Notification Service Info
    public APSInfo type;
    public GlipAPNSInfo type(APSInfo type) {
        this.type = type;
        return this;
    }
    // Datetime of a call action in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    public GlipAPNSInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Universally unique identifier of a notification
    public String uuid;
    public GlipAPNSInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    // Event filter URI
    public String event;
    public GlipAPNSInfo event(String event) {
        this.event = event;
        return this;
    }
    // Internal identifier of a subscription
    public String subscriptionId;
    public GlipAPNSInfo subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    // Unread messages data
    public GlipUnreadMessageCountInfo body;
    public GlipAPNSInfo body(GlipUnreadMessageCountInfo body) {
        this.body = body;
        return this;
    }
}
