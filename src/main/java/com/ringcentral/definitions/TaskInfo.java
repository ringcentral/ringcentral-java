package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TaskInfo
{
    // Internal identifier of a task
    public String id;
    public TaskInfo id(String id) {
        this.id = id;
        return this;
    }
    // Link to a task resource
    public String uri;
    public TaskInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Device order status
    public String status;
    public TaskInfo status(String status) {
        this.status = status;
        return this;
    }
    // Task creation time
    public String creationTime;
    public TaskInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Time of task last modification
    public String lastModifiedTime;
    public TaskInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
