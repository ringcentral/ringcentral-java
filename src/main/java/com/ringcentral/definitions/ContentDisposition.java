package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContentDisposition
{
    //
    public String type;
    public ContentDisposition type(String type) {
        this.type = type;
        return this;
    }
    //
    public String fileName;
    public ContentDisposition fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    //
    public String creationDate;
    public ContentDisposition creationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    //
    public String modificationDate;
    public ContentDisposition modificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    //
    public String readDate;
    public ContentDisposition readDate(String readDate) {
        this.readDate = readDate;
        return this;
    }
    //
    public Long size;
    public ContentDisposition size(Long size) {
        this.size = size;
        return this;
    }
}
