package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LineInfo
{
    // Internal identifier of a monitored extension
    public String id;
    public LineInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a monitored extension
    public String uri;
    public LineInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Brief information on a monitored extension
    public ExtensionInfoMonitoredLines extension;
    public LineInfo extension(ExtensionInfoMonitoredLines extension) {
        this.extension = extension;
        return this;
    }
}
