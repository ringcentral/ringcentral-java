package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DepartmentResource
{
    //
    public String uri;
    public DepartmentResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public DepartmentResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String extensionNumber;
    public DepartmentResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
