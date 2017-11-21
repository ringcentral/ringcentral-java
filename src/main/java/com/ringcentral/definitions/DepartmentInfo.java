package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DepartmentInfo
{
    // Internal identifier of a department extension
    public String id;
    public DepartmentInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a department extension
    public String uri;
    public DepartmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Number of a department extension
    public String extensionNumber;
    public DepartmentInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
