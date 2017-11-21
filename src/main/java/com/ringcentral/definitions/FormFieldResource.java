package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FormFieldResource
{
    //
    public String name;
    public FormFieldResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String fieldType;
    public FormFieldResource fieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    //
    public String description;
    public FormFieldResource description(String description) {
        this.description = description;
        return this;
    }
    //
    public Long maxLength;
    public FormFieldResource maxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
}
