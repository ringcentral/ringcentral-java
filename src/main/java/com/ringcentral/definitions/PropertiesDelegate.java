package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PropertiesDelegate
{
    //
    public String[] propertyNames;
    public PropertiesDelegate propertyNames(String[] propertyNames) {
        this.propertyNames = propertyNames;
        return this;
    }
}
