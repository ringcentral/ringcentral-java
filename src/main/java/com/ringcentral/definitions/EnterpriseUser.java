package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EnterpriseUser
{
    //
    public String department;
    public EnterpriseUser department(String department) {
        this.department = department;
        return this;
    }
}
