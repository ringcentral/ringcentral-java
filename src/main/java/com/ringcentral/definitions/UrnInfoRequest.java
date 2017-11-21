package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UrnInfoRequest
{
    // Name of department (call queue) member
    public String department;
    public UrnInfoRequest department(String department) {
        this.department = department;
        return this;
    }
}
