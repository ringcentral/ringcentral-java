package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetTimezoneInfoResponse
{
    // Internal identifier of a timezone
    public String id;
    public GetTimezoneInfoResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of the timezone
    public String uri;
    public GetTimezoneInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Short name of the timezone
    public String name;
    public GetTimezoneInfoResponse name(String name) {
        this.name = name;
        return this;
    }
    // Description of the timezone
    public String description;
    public GetTimezoneInfoResponse description(String description) {
        this.description = description;
        return this;
    }
}
