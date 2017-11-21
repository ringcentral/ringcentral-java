package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MetaInfo
{
    // Specification links
    public String[] schemas;
    public MetaInfo schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // User type
    public String resourceType;
    public MetaInfo resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    // Datetime of user creation in ISO 8601 format, for example 2016-03-10T18:07:52.534Z
    public String created;
    public MetaInfo created(String created) {
        this.created = created;
        return this;
    }
    // Datetime of the last change of user information in ISO 8601 format,for example 2016-03-10T18:07:52.534Z
    public String lastModified;
    public MetaInfo lastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    // User location
    public String location;
    public MetaInfo location(String location) {
        this.location = location;
        return this;
    }
}
