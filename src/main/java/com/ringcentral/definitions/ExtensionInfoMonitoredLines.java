package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionInfoMonitoredLines
{
    // Internal identifier of a monitored extension
    public String id;
    public ExtensionInfoMonitoredLines id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a monitored extension
    public String uri;
    public ExtensionInfoMonitoredLines uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Brief information on a monitored extension
    public String extensionNumber;
    public ExtensionInfoMonitoredLines extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Type of a monitored extension
    public String type;
    public ExtensionInfoMonitoredLines type(String type) {
        this.type = type;
        return this;
    }
}
