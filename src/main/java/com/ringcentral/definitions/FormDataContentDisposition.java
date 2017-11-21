package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FormDataContentDisposition
{
    //
    public String type;
    public FormDataContentDisposition type(String type) {
        this.type = type;
        return this;
    }
    //
    public String fileName;
    public FormDataContentDisposition fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    //
    public String creationDate;
    public FormDataContentDisposition creationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    //
    public String modificationDate;
    public FormDataContentDisposition modificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    //
    public String readDate;
    public FormDataContentDisposition readDate(String readDate) {
        this.readDate = readDate;
        return this;
    }
    //
    public Long size;
    public FormDataContentDisposition size(Long size) {
        this.size = size;
        return this;
    }
    //
    public String name;
    public FormDataContentDisposition name(String name) {
        this.name = name;
        return this;
    }
}
